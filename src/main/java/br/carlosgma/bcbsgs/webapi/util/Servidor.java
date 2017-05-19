package br.carlosgma.bcbsgs.webapi.util;

import java.io.IOException;
import java.net.URI;

import org.glassfish.grizzly.http.server.HttpServer;
import org.glassfish.jersey.grizzly2.httpserver.GrizzlyHttpServerFactory;
import org.glassfish.jersey.server.ResourceConfig;



public class Servidor 
{
	public static void main(String[] args) throws IOException 
	{
		System.out.println("GMA Inicio");
        
		HttpServer server=iniciarServidor();
		
		System.out.println("Servidor rodando");

		System.in.read();
		
		//TODO retirar stop 
		server.stop();

	}
	
	public static HttpServer iniciarServidor() throws IOException
	{
	    ResourceConfig config = new ResourceConfig().packages("br.gma.bancensgs.resource");
	    
	    URI uri = URI.create("http://localhost:8083/api");
       
	    HttpServer server = GrizzlyHttpServerFactory.createHttpServer(uri, config);
	    server.start();
	    return server;
	}	

}
