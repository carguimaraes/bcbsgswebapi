package br.carlosgma.bcbsgs.webapi;

import java.rmi.RemoteException;

import br.gov.bcb.pec.sgs.casosdeuso.ws.comum.WSSerieVO;
import br.gov.bcb.www3.wssgs.services.FachadaWSSGS.FachadaWSSGSProxy;


public class TesteSOA {

	public static void main(String[] args)
	{
		WSSerieVO serieVO;	
		 FachadaWSSGSProxy serviceProxy;
		 
		 serviceProxy= new FachadaWSSGSProxy();
		 
		 System.out.println("Inicio Teste GMA");
		 
		 try 
		 {
			//serieVO=serviceProxy.getUltimoValorVO(999195);
			serieVO=serviceProxy.getUltimoValorVO(195);
			
			
			 System.out.println("===>"+serieVO.getNomeCompleto());
		 }
		 catch (RemoteException e) 
		 {
			// TODO Auto-generated catch block
		 //	e.printStackTrace();
			 
			 System.out.println("ERRO ACESSO SERVICO");		 
			 System.out.println("==>"+e.getMessage());
			  
			
		}
		 
		  
		  
		  System.out.println("Fim Teste GMA");

	}

}
