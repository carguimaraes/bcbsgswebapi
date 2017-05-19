package br.carlosgma.bcbsgs.webapi.service;

import javax.ws.rs.core.Response;

public class ApiServiceRetorno 
{
	 private  Response.Status _httpStatusCode;
     private Object _retorno;
     
     public Object ObterRetorno()
     {

         return _retorno;
     }
     
     
     public Response.Status ObterHttpStatusCode()
     {

         return _httpStatusCode;
     }
     
     public static <T> ApiServiceRetorno getApiServiceRetorno(Response.Status pr_httpStatusCode, T pr_retorno )
     {
    	 ApiServiceRetorno o = new ApiServiceRetorno();
    	 
    	 o._httpStatusCode=pr_httpStatusCode;
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
    	  return getApiServiceRetorno(Response.Status.NOT_FOUND, mensagens);
     }
     
     //400
     public static ApiServiceRetorno FalhaValidacaoSolicitacao(String[] mensagens)
     {
       
         return getApiServiceRetorno(Response.Status.BAD_REQUEST, mensagens);
     }
     
     //500
     public static ApiServiceRetorno FalhaServidor(String[] mensagens)
     {
     
       
         return getApiServiceRetorno(Response.Status.INTERNAL_SERVER_ERROR, mensagens);
         
     }
     
}
