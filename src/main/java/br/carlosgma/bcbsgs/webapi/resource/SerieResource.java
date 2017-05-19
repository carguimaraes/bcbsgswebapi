package br.carlosgma.bcbsgs.webapi.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import br.carlosgma.bcbsgs.webapi.dto.SerieDto;
import br.carlosgma.bcbsgs.webapi.service.ApiServiceRetorno;
import br.carlosgma.bcbsgs.webapi.service.SerieWebApiService;
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
		SerieWebApiService serieWebApiService= new SerieWebApiService();  
		
		// ApiServiceRetorno s=  _areaAtuacaoWebApiService.getListaAreaAtuacao();
		
		ApiServiceRetorno retorno =serieWebApiService.ObeterSerie(codigo);
		
		 
        return Response.status(retorno.ObterHttpStatus())
        		.entity(retorno.ObterRetorno())
        		 
        		.encoding("charset=UTF-8")
                .header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_TYPE.withCharset("utf-8"))

        		.build();

	
	  
	}

}
