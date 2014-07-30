package com.hackbulgaria.corejava;

import java.net.MalformedURLException;
import java.net.URL;

import javax.mail.Multipart;






public class SendEmail {


    public static void main(String args[]) throws MalformedURLException, EmailException {


        EmailAttachment attachment = new EmailAttachment();
        attachment.setURL(new URL("http://d3dsacqprgcsqh.cloudfront.net/photo/azbW3zq_460sa_v1.gif"));


        MultiPartEmail email = new MultiPartEmail();


        email.setHostName("smtp.googlemail.com");
        email.setSmtpPort(465);
        email.setAuthenticator(new DefaultAuthenticator("username", "******"));
        email.setSSLOnConnect(true);
        email.setFrom("user@gmail.com", "User");
        email.setSubject("Suarez");
        email.setMsg("Suarez accident");
        email.addTo("user@gmail.com");
        email.attach(attachment);
        email.send();
    }
}

