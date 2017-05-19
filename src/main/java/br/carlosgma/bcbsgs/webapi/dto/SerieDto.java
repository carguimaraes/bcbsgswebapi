package br.carlosgma.bcbsgs.webapi.dto;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class SerieDto 
{

	public SerieDto(){}
	
	@XmlAttribute
	 public String getNomeTeste(){
		 return "Teste api";
	 }
}
