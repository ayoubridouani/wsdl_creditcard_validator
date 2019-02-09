package server;

import javax.xml.ws.Endpoint;

public class Main {

	public static void main(String[] args) {
		try {
			Endpoint.publish("http://localhost:4780/server/main", new CardValidator());
			System.out.println("Done");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
