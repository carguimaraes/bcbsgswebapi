package teste.integracao.carlosgma.bcbsgswebapi;

import java.io.IOException;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;

import org.glassfish.grizzly.http.server.HttpServer;
import org.glassfish.jersey.grizzly2.httpserver.GrizzlyHttpServerFactory;
import org.glassfish.jersey.server.ResourceConfig;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.sun.org.apache.xerces.internal.util.URI;

import br.carlosgma.bcbsgs.webapi.dto.SerieDto;
import  br.carlosgma.bcbsgs.webapi.util.*;

import junit.framework.Assert;

public class ClienteTest {
	private HttpServer _servidor;
	
	@Before
	public void iniciarServidor() throws IOException 
	{
	
		_servidor=Servidor.iniciarServidor();
		System.out.println("====>SERVIDOR START");
	}
	
	 @After
	 public void pararServidor() 
	 {
		     //TODO resolver stop;
	        _servidor.stop();
	    	System.out.println("====>SERVIDOR STOP");
	 }
	 
	 
	// @Test
	 public void conectar_servidor() 
	 {
		// Client client = ClientBuilder.newClient();

		 
		 //WebTarget target = client.target("http://localhost:8083");
		 	 
		 
		
		//SerieDto serieDto = target.path("/api/v1/series/111/ultimovalor").request().get(SerieDto.class);
		 
		// Response response = target.path("/carrinhos/1").request().get();
		 
		// System.out.println(serieDto.getNomeTeste());

		  
		Assert.assertTrue("Carlos".contains("Rua Vergueiro 3185"));
	 }


}
