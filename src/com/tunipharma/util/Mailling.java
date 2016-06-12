/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tunipharma.util;

import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;
import javax.activation.*;

/**
 *
 * @author PLAYER9
 */
public class Mailling {
    public static void sendMail(String to,String phnLogin,String phnPwd){
           // SUBSTITUTE YOUR EMAIL ADDRESSES HERE!!!
        //String to = "iheb.kacem@esprit.tn";
        String from = "iheb.kacem@gmail.com";
        String pwd = "hhbbeeii";
        // SUBSTITUTE YOUR ISP'S MAIL SERVER HERE!!!
        String host = "smtp.gmail.com";

        // Create properties, get Session
        Properties props = new Properties();

        // If using static Transport.send(),
        // need to specify which host to send it to
        props.put("mail.smtp.host", host);
        // To see what is going on behind the scene
        //props.put("mail.debug", "true");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        Session session = Session.getInstance(props);

        try {
            // Instantiatee a message
            Message msg = new MimeMessage(session);

            //Set message attributes
            msg.setFrom(new InternetAddress(from));
            InternetAddress[] address = {new InternetAddress(to)};
            msg.setRecipients(Message.RecipientType.TO, address);
            msg.setSubject("Confirmation TUNIPHARMA");
            msg.setSentDate(new Date());

            // Set message content
            msg.setText("Bonjour,\n " +
                        "Suite a l'inscription de votre pharmacie dans l'application TUNIPHARMA,\n " +
                        "ainsi que vous en tant que son pharmacien, on vous accorde vos informations\n " +
                        "d'authentification:\n " +
                        "LOGIN : "+phnLogin+"\n " +
                        "PASSWORD : "+phnPwd+"\n " +
                        "\n" +
                        "On vous remercie pour votre confiance !!!\n " +
                        "\n"+
                        "\n"+
                        "Administrateur TUNIPHARMA,\n"+
                        "Coordialement,");

            //Send the message
            Transport transport = session.getTransport("smtp");
            transport.connect(host, from, pwd);
            transport.sendMessage(msg, msg.getAllRecipients());
            
            //transport.send(msg);
        }
        catch (MessagingException mex) {
            // Prints all nested (chained) exceptions as well
            mex.printStackTrace();
           
        }
    }
    
}
