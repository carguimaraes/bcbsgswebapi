package br.carlosgma.bcbsgs.webapi.service;
import java.rmi.RemoteException;

import br.gov.bcb.pec.sgs.casosdeuso.ws.comum.WSSerieVO;
import br.gov.bcb.pec.sgs.casosdeuso.ws.comum.WSValorSerieVO;
import br.gov.bcb.www3.wssgs.services.FachadaWSSGS.FachadaWSSGSProxy;

public class SerieSOAService 
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

	public WSSerieVO ObeterSerie()
	{
	     WSSerieVO serieVO=null;	
		 FachadaWSSGSProxy serviceProxy;
		 
		 serviceProxy= new FachadaWSSGSProxy();
		 
		  
		 
		 try 
		 {
			
			serieVO=serviceProxy.getUltimoValorVO(195);
			
			
		 }
		 catch (RemoteException e) 
		 {
			 
			 System.out.println("ERRO ACESSO SERVICO");		 
			 System.out.println("==>"+e.getMessage());
			  
			
		}
		 
		  
		  
	     return serieVO;
	}
}
