package com.crb;
import java.net.Authenticator;
import java.net.InetAddress;
import java.net.PasswordAuthentication;

public class CustomAuthenticator extends Authenticator {
	         
	        // Called when password authorization is needed
	        protected PasswordAuthentication getPasswordAuthentication() {
	             
	            // Get information about the request
	            String prompt = getRequestingPrompt();
	            String hostname = getRequestingHost();
	            InetAddress ipaddr = getRequestingSite();
	            int port = getRequestingPort();
	 
	            String username = "KEFq7NE3vzu";
	            String password = "PnNeGUcBdx0EMJ";
	 
	            // Return the information (a data holder that is used by Authenticator)
	            return new PasswordAuthentication(username, password.toCharArray());
	             
	        }
	         
	    }