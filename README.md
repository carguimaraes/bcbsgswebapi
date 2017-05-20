# bcbsgswebapi



Projeto desenvolvido por Carlos Alberto Luciano Martins Guimarães

Objetivo:

Consumir um WebService SOAP de consulta de Cotação de Moedas do Banco central, e expor esse serviço com um outro serviço Rest produzindo um arquivo json com a estrutura da operação getUltimoValorVO.


https://www3.bcb.gov.br/sgspub/JSP/sgsgeral/sgsAjuda.jsp

https://www3.bcb.gov.br/sgspub/localizarseries/localizarSeries.do?method=prepararTelaLocalizarSeries

======== Teste no Eclipse com grizzly

   br.carlosgma.bcbsgs.cliente.rest.Cliente

 ======== Teste no Tomcat - Ececutar Maven (package ) e copiar "war"  para tomcat 
 
 http://localhost:8088/carlosgmabcbsgswebapi/api/v1/series/22/ultimovalor
 




TODO:
.Stop - retirar chamada do servidor  grizzly
.Mensagem para rota nao definida
.Injentar codigo (CDI) - retirar o acoplamento 
.Montar teste unitario
.Montar um Mapper para DTO e nao usar as classes do servi�o SOA