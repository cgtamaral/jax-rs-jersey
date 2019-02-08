package com.javaee.controllers;
import java.io.IOException;
import java.net.URI;

import org.glassfish.grizzly.http.server.HttpServer;
import org.glassfish.jersey.grizzly2.httpserver.GrizzlyHttpServerFactory;
import org.glassfish.jersey.server.ResourceConfig;

public class Main {
	static final String BASE_URI = "http://localhost:8080/";
	
	static HttpServer startServer()
	{
		final ResourceConfig config = new ResourceConfig().packages("com.javaee.jersey.controllers");
		
		return GrizzlyHttpServerFactory.createHttpServer(URI.create(BASE_URI), config);
	}
	
	public Main() throws IOException {
		final HttpServer server = startServer();
		System.out.println(String.format("Jersey app started with WADL available at "
		+ "%application.wadl\nHit enter to stop it...", BASE_URI));
		
		System.in.read();
		server.shutdown();
	}
}
