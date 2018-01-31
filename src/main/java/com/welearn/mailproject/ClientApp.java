/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.welearn.mailproject;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.internet.AddressException;




/**
 *
 * @author Alexander
 */
public class ClientApp {
    
public static void main(String[] args) throws MessagingException
{
    Properties smtpProperties;
    try {
        smtpProperties = new ConfigUtility().loadProperties();
        new EmailUtility().sendEmail(smtpProperties, "g02376510@gmail.com", "test", "test", null);
    } catch (IOException ex) {
        Logger.getLogger(ClientApp.class.getName()).log(Level.SEVERE, null, ex);
    }
    
}
    
}
