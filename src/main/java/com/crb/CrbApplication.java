package com.crb;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Authenticator;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.PasswordAuthentication;
import java.net.URL;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CrbApplication {

	public static void main(String[] args) {
		
		
		 try {
             
	            // Sets the authenticator that will be used by the networking code
	            // when a proxy or an HTTP server asks for authentication.
	            Authenticator.setDefault(new CustomAuthenticator());
	             
	            URL url = new URL("https://secure3.crbafrica.com/crbws/ke?wsdl");
	             
	            // read text returned by server
	            BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
	             
	            String line;
	            while ((line = in.readLine()) != null) {
	                System.out.println(line);
	            }
	            in.close();
	             
	        }
	        catch (MalformedURLException e) {
	            System.out.println("Malformed URL: " + e.getMessage());
	        }
	        catch (IOException e) {
	            System.out.println("I/O Error: " + e.getMessage());
	        }
		  SpringApplication.run(CrbApplication.class, args);
	         
	    }
	     
	
}


