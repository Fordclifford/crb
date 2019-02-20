package com.crb;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Authenticator;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.PasswordAuthentication;
import java.net.URL;
import java.rmi.RemoteException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import co.ke.transunion.crbws.ws.Product126;
import co.ke.transunion.crbws.ws.ServerInfo;

@SpringBootApplication
public class CrbApplication {

	public CrbApplication() {
		System.setProperty("https.protocols", "TLSv1.2");
	}

	public static void main(String[] args) {

		KenyaClientService clientService = new KenyaClientService("https://secure3.crbafrica.com/crbws/ke?wsdl", "Transport Level Username",
				"Transport layer password");

		try {
			ServerInfo serverInfo = clientService.retrieveServerInfo("Your Username", "Your Password", "Your code", "ke123456789");
			System.out.println("Response Code: " + serverInfo.getResponseCode());

			Product126 product126 = clientService.getProduct126("", "", "", "ke123456789", "Other",
					"A N", null, null, "1111111111", null, null, null, null, null, null, null, null, null, null, null,
					null, null, null, 1, 2);
			
			System.out.println(product126);

			if (serverInfo.getResponseCode() == 100) {
				// System.out.println("Protocol: " serverInfo.getProtocol());
				System.out.println("Country: " + serverInfo.getCountry());
				System.out.println("Version: " + serverInfo.getVersion());

			}
		} catch (RemoteException e) {
			e.printStackTrace();
		}
	}

//	public static void main(String[] args) {
//		
//		
//		 try {
//             
//	            // Sets the authenticator that will be used by the networking code
//	            // when a proxy or an HTTP server asks for authentication.
//	            Authenticator.setDefault(new CustomAuthenticator());
//	             
//	            URL url = new URL("https://secure3.crbafrica.com/crbws/ke?wsdl");
//	             
//	            // read text returned by server
//	            BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
//	             
//	            String line;
//	            while ((line = in.readLine()) != null) {
//	                System.out.println(line);
//	            }
//	            in.close();
//	             
//	        }
//	        catch (MalformedURLException e) {
//	            System.out.println("Malformed URL: " + e.getMessage());
//	        }
//	        catch (IOException e) {
//	            System.out.println("I/O Error: " + e.getMessage());
//	        }
//		  SpringApplication.run(CrbApplication.class, args);
//	         
//	    }
//	     

}
