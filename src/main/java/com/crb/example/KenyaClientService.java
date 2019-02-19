package com.crb.example;

import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;

import org.hibernate.service.spi.ServiceException;

import co.ke.transunion.crbws.ws.ServerInfo;
import co.ke.transunion.crbws.ws.impl.ControllerKenyaImplService;;

public class KenyaClientService {
	private ControllerKenyaImplService controller;

	public KenyaClientService(String url, String username, String password) {
		init(url, username, password);
	}

	private void init(String url, String username, String password) {
		try {
			URL wsdlUrl = new URL(url);
			controller = (ControllerKenyaImplService) (new ControllerKenyaImplService()).getControllerKenyaImplPort();
			controller.setUsername(username);
			controller.setPassword(password);
			controller.setMaintainSession(true);
		} catch (ServiceException e) {
			e.printStackTrace();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

public ServerInfo retrieveServerInfo(String username, String password,
String code, String infinityCode) throws RemoteException {
return controller.getServerInfo(username, password, code,
infinityCode);
}
