package com.kevapp.webservice.serverws;

import javax.xml.ws.Endpoint;

import com.kevapp.webservice.serverws.service.SongImpl;

public class App {

	public static void main(String[] args) {
		Endpoint.publish("http://localhost:8181/WS/Songs", new SongImpl());
		System.out.println("Server running: http://localhost:8181/WS/Songs");
	}

}
