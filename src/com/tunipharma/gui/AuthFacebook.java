package com.tunipharma.gui;

import chrriis.dj.nativeswing.swtimpl.NativeInterface;
import chrriis.dj.nativeswing.swtimpl.components.JWebBrowser;
import chrriis.dj.nativeswing.swtimpl.components.WebBrowserAdapter;
import chrriis.dj.nativeswing.swtimpl.components.WebBrowserNavigationEvent;
import com.restfb.DefaultFacebookClient;
import com.restfb.FacebookClient;
import com.restfb.types.User;
import com.tunipharma.entities.ClientFacebook;
import com.tunipharma.test.MainTest;
import java.awt.BorderLayout;
import java.io.IOException;
import java.io.StringReader;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.text.html.HTMLEditorKit;
import javax.swing.text.html.parser.ParserDelegator;

public class AuthFacebook extends WebBrowserAdapter {

    private final String API_KEY = "275568739268363";
    private final String SECRET = "24f5e5afbc8a28f9828538020406dde8";

    private final String firstRequest = "https://graph.facebook.com/oauth/authorize?"
            + "client_id="
            + API_KEY
            + "&redirect_uri=http://www.facebook.com/connect/login_success.html&"
            + "scope=publish_stream,offline_access,create_event,read_stream,email,user_birthday";

    private final String secondRequest = "https://graph.facebook.com/oauth/access_token?"
            + "client_id="
            + API_KEY
            + "&redirect_uri=http://www.facebook.com/connect/login_success.html&"
            + "client_secret=" + SECRET + "&code=";

    private static String access_token = "";

    private boolean firstRequestDone = false;
    private final boolean secondRequestDone = false;

    private final JFrame authFrame;
    private final JPanel webBrowserPanel;
    private final JWebBrowser webBrowser;

    private static FacebookClient facebookClient;

    private EspaceClient espaceClient;

    public AuthFacebook(EspaceClient espaceClient) {
        this.espaceClient = espaceClient;
        NativeInterface.open();
        NativeInterface.initialize();
        authFrame = new JFrame();
        // Create the JWebBrowser and add the WebBrowserAdapter
        webBrowserPanel = new JPanel(new BorderLayout());
        webBrowser = new JWebBrowser();

        webBrowser.navigate(firstRequest);

        webBrowser.addWebBrowserListener(this);
        webBrowserPanel.add(webBrowser, BorderLayout.CENTER);

        authFrame.add(webBrowserPanel);

        authFrame.setSize(800, 600);
        authFrame.setVisible(true);
    }

    @Override
    public void locationChanged(WebBrowserNavigationEvent e
    ) {
        super.locationChanged(e);
        // Check if first request was not done
        if (!firstRequestDone) {
            // Check if you left the location and were redirected to the next 
            // location
            if (e.getNewResourceLocation().contains("http://www.facebook.com/connect/login_success.html?code=")) {
                // If it successfully redirects you, get the verification code
                // and go for a second request
                String[] splits = e.getNewResourceLocation().split("=");
                String stage2temp = secondRequest + splits[1];
                webBrowser.navigate(stage2temp);
                firstRequestDone = true;
            }
        } else {
            // If secondRequest is not done yet, you perform this and get the 
            // access_token
            if (!secondRequestDone) {
                // Create reader with the html content
                StringReader readerSTR = new StringReader(webBrowser.getHTMLContent());
                // Create a callback for html parser
                HTMLEditorKit.ParserCallback callback
                        = new HTMLEditorKit.ParserCallback() {
                            @Override
                            public void handleText(char[] data, int pos) {
                                // because there is only one line with the access_token 
                                // in the html content you can parse it.
                                String string = new String(data);
                                String[] temp1 = string.split("&");
                                String[] temp2 = temp1[0].split("=");
                                access_token = temp2[1];
                                authFrame.setVisible(false);
                                facebookClient = new DefaultFacebookClient(access_token);
                                User user = facebookClient.fetchObject("me", User.class);
                                espaceClient.cf = new ClientFacebook(Long.parseLong(user.getId()), user.getName(), user.getUsername(), user.getEmail(), new Date(user.getBirthday()));
                                espaceClient.ClientModifier();
                            }
                        };
                try {
                    // Call the parse method 
                    new ParserDelegator().parse(readerSTR, callback, false);
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
                // After everything is done, you can dispose the jframe
                //authFrame.dispose();      
            }
        }
    }

//    public ClientFacebook getUser() {
//
//        User user = facebookClient.fetchObject("me", User.class);
//        System.out.println("Name: " + user.getName());
//        System.out.println("Username: " + user.getUsername());
//        System.out.println("Email: " + user.getEmail());
//        System.out.println("ID Facebook: " + user.getId());
//        System.out.println("About: " + user.getAbout());
//        System.out.println("Birthday: " + user.getBirthday());
//        return new ClientFacebook(Long.parseLong(user.getId()), user.getName(), user.getUsername(), user.getEmail(), new Date(user.getBirthday()));
//    }
}
