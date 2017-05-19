package br.carlosgma.bcbsgs.webapi.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import br.carlosgma.bcbsgs.webapi.dto.SerieDto;
import br.carlosgma.bcbsgs.webapi.service.SerieSOAService;
import br.gov.bcb.pec.sgs.casosdeuso.ws.comum.WSSerieVO;

@Path("v1/series")
public class SerieResource {
	
	//series/111/ultimovalor
	@Path("{codigo}/ultimovalor")
	@GET
    @Produces(MediaType.APPLICATION_JSON)
	public Response getUltimoValor(@PathParam("codigo") int codigo)
	{
		//TODO tratar not encontrar
		SerieSOAService serieSOAService= new SerieSOAService();  
		
		WSSerieVO serieVO =serieSOAService.ObeterSerie();
		
	  	return   Response.ok(serieVO , MediaType.APPLICATION_JSON).build();	  
	}

}
