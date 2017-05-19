package br.carlosgma.bcbsgs.webapi.service;

import javax.ws.rs.core.Response;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

public class ApiServiceRetorno 
{
	 private  Response.Status _httpStatus;
     private Object _retorno;
     
     public Object ObterRetorno()
     {

         return _retorno;
     }
     
     
     public Response.Status ObterHttpStatus()
     {

         return _httpStatus;
     }
     
     public static <T> ApiServiceRetorno getApiServiceRetorno(Response.Status pr_httpStatus, T pr_retorno )
     {
    	 ApiServiceRetorno o = new ApiServiceRetorno();
    	 
    	 o._httpStatus=pr_httpStatus;
    	 o._retorno=pr_retorno;
    	 
    	return o;
     }
     
     //200
     public static <T> ApiServiceRetorno Sucesso(T obj)
     {
         
         return getApiServiceRetorno(Response.Status.OK, obj);
     }
     
     //404
     public static <T> ApiServiceRetorno FalhaRetornoVazioOuNaoEncontrado(String[] mensagens)
     {
    	  return getApiServiceRetorno(Response.Status.NOT_FOUND,   new ApiMensagemErro(404, mensagens));
     }
     
     //400
     public static ApiServiceRetorno FalhaValidacaoSolicitacao(String[] mensagens)
     {
    	
    	 
         return getApiServiceRetorno(Response.Status.BAD_REQUEST, new ApiMensagemErro(400, mensagens));
     }
     
     //500
     public static ApiServiceRetorno FalhaServidor(String[] mensagens)
     {
     
       
         return getApiServiceRetorno(Response.Status.INTERNAL_SERVER_ERROR, new ApiMensagemErro(500, mensagens));
         
     }
     
}
