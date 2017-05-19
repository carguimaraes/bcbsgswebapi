package br.carlosgma.bcbsgs.cliente.rest;

import java.io.IOException;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;

import org.glassfish.grizzly.http.server.HttpServer;

import br.carlosgma.bcbsgs.webapi.util.Servidor;

import br.gov.bcb.pec.sgs.casosdeuso.ws.comum.WSSerieVO;


public class Cliente 
{
	
	
	 public static void main(String[] args)
	 {
		 
	
		HttpServer servidor;
		 
        Client client = ClientBuilder.newClient();
		 
		WebTarget target = client.target(Servidor.URL_SERVICO_REST);
		 
		try 
		{
		 servidor=Servidor.iniciarServidor();
		 System.out.println("====>SERVIDOR START");
		
		 WSSerieVO serie = target.path("/api/v1/series/22/ultimovalor").request().get(WSSerieVO.class);
		 
		 
		 System.out.println("Teste Cliente Rest: "+serie.getFullName());
		 
		  servidor.stop();
	    }
		catch (IOException e)
	    {
		  System.out.println(e.getMessage());
		}
		
		  
		 
		  
		  
		 
		 
	 }
}
