/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tunipharma.util;

import java.util.Hashtable;
import javax.naming.Context;
import javax.naming.NamingEnumeration;
import javax.naming.directory.Attribute;
import javax.naming.directory.Attributes;
import javax.naming.directory.BasicAttribute;
import javax.naming.directory.BasicAttributes;
import javax.naming.directory.DirContext;
import javax.naming.directory.InitialDirContext;
import javax.naming.directory.SearchControls;
import javax.naming.directory.SearchResult;

/**
 *
 * @author PLAYER9
 */
public class MyLdapConnection {

    public static DirContext getCtx(String name, String pwd) {
        try {
            Hashtable<String, String> env = new Hashtable<String, String>();
            env.put(Context.INITIAL_CONTEXT_FACTORY, "com.sun.jndi.ldap.LdapCtxFactory");
            env.put(Context.PROVIDER_URL, "ldap://192.168.43.111:389");

            env.put(Context.SECURITY_AUTHENTICATION, "simple");
            env.put(Context.SECURITY_PRINCIPAL, name + ",dc=esprit,dc=tn");
            env.put(Context.SECURITY_CREDENTIALS, pwd);

            DirContext ctx = new InitialDirContext(env);
            return ctx;
        } catch (Exception e) {
            //e.printStackTrace();
            return null;
        }
    }

    public static String verifStatut(String login, String pwd) {
        if (Authentification("cn=" + login + ",cn=admin", pwd)) {
            return "admin";
        } else{ if (Authentification("cn=" + login + ",cn=pharmacien", pwd)) {
            return "pharmacien";
        } else {
            return "fail";
        }
        }
    }

    public static boolean Authentification(String cn, String pwd) {
        try {
            DirContext ctx = getCtx(cn, pwd);
            boolean result = (ctx != null);
            System.out.println(result);
            if (result) {
                ctx.close();
            }
            return result;
        } catch (Exception e) {
            return false;
        }
    }

    public static String getIdNb(String login, String pwd) {

        DirContext ctx = getCtx("cn=" + login + ",cn=pharmacien", pwd);
        NamingEnumeration results = null;
        Attributes attributes = null;
        try {
            SearchControls controls = new SearchControls();
            controls.setSearchScope(SearchControls.SUBTREE_SCOPE);
            results = ctx.search("cn=" + login + ",cn=pharmacien,dc=esprit,dc=tn", "(objectclass=pharmaAccount)", controls);
            while (results.hasMore()) {
                SearchResult searchResult = (SearchResult) results.next();
                attributes = searchResult.getAttributes();
            }
        } catch (Throwable e) {
            e.printStackTrace();
            return null;
        } finally {
            if (results != null) {
                try {
                    results.close();
                } catch (Exception e) {
                }
            }
            if (ctx != null) {
                try {
                    ctx.close();
                } catch (Exception e) {
                }
            }
            String ch = "" + attributes.get("idNb");
            return (ch.substring(6));
        }
    }

    public static boolean setUser(String comn, String idNum, String pwd) {
        try {
            DirContext ctx = getCtx("cn=Manager", "esprit");

            Attributes attributes = new BasicAttributes();
            Attribute objectClass = new BasicAttribute("objectClass");
            objectClass.add("pharmaAccount");
            attributes.put(objectClass);

            Attribute cn = new BasicAttribute("cn");
            Attribute idNb = new BasicAttribute("idNb");
            Attribute userPwd = new BasicAttribute("userPassword");

            idNb.add(idNum);
            userPwd.add(pwd);

            attributes.put(idNb);
            attributes.put(userPwd);

            ctx.createSubcontext("ldap://192.168.43.111:389/cn=" + comn + ",cn=pharmacien,dc=esprit,dc=tn", attributes);
            if (ctx != null) {
                ctx.close();
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

}
