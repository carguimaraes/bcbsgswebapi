package br.carlosgma.bcbsgs.webapi.service;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ApiMensagemErro {
	
	  private int _httpStatusCode;
      private String[] _listaMsg;
      
      public ApiMensagemErro(){}
      
      public ApiMensagemErro(int httpStatusCode, String[] listaMsg )
      {
   	   _httpStatusCode= httpStatusCode;
   	   _listaMsg=listaMsg;
   	   
      }
      
      @XmlAttribute
      public int getHttpStatusCode()   { return _httpStatusCode; }
      
      @XmlElement
      public String[] getMensagens()   { return _listaMsg; }

}
