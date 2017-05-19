package br.carlosgma.bcbsgs.webapi.service;
import java.rmi.RemoteException;

import br.gov.bcb.pec.sgs.casosdeuso.ws.comum.WSSerieVO;
import br.gov.bcb.pec.sgs.casosdeuso.ws.comum.WSValorSerieVO;
import br.gov.bcb.www3.wssgs.services.FachadaWSSGS.FachadaWSSGSProxy;

public class SerieWebApiService 
{
	
	public WSSerieVO ObeterSerie_()
	{
		 WSSerieVO serieVO= new WSSerieVO(); 
		 WSValorSerieVO  ultimoValor= new WSValorSerieVO();
		 WSValorSerieVO[]  valores= new WSValorSerieVO[2];
		 
		 
		 
		 ultimoValor.setAno(1997);
		 
		 valores[0]=ultimoValor;
		 valores[1]=ultimoValor;
		 
		 serieVO.setFonte("tetse");
		 serieVO.setUltimoValor(ultimoValor);
		 serieVO.setValores(valores);
		 
		 
		 return serieVO;
	}

	public ApiServiceRetorno ObeterSerie(int codSerie)
	{
	     WSSerieVO serieVO=null;	
		 FachadaWSSGSProxy serviceProxy;
		 
		 serviceProxy= new FachadaWSSGSProxy();
		 
		  
		 
		 try 
		 {
			
			serieVO=serviceProxy.getUltimoValorVO(codSerie);
			
			
		 }
		 catch (RemoteException e) 
		 {
			 
			 
		    //"br.gov.bcb.pec.sgs.comum.excecoes.SGSNegocioException: No series found"
             
			 if(e.getMessage().contains("No series found"))
			 {
				 return ApiServiceRetorno.FalhaRetornoVazioOuNaoEncontrado((new String[]{"Serie não encontrada"}));
			 }
			 

			 return ApiServiceRetorno.FalhaServidor(new String[]{e.getMessage()});
			 
		}
		 
	//	 return ApiServiceRetorno.FalhaRetornoVazioOuNaoEncontrado(new String[] {"ola teste","Erro valor"}); 
		  
	     return ApiServiceRetorno.Sucesso(serieVO);
	}
}
