# bcbsgswebapi

Projeto desenvolvido por Carlos Alberto Luciano Martins Guimarães

Objetivo:

Consumir um WebService SOAP de consulta de Cotação de Moedas do Banco central, e expor esse serviço com um outro serviço Rest produzindo um arquivo json com a estrutura da operação getUltimoValorVO.


https://www3.bcb.gov.br/sgspub/JSP/sgsgeral/sgsAjuda.jsp

https://www3.bcb.gov.br/sgspub/localizarseries/localizarSeries.do?method=prepararTelaLocalizarSeries

Para testar o servi�o - no ambiente eclipse : 

... Levantar servidor no Eclipse - Rodar classe: Servidor
 
http://localhost:8083/api/v1/series/{COIDIGO DA SERIE}/ultimovalor
http://localhost:8083/api/v1/series/22/ultimovalor

Para testar outro ambiente: 
1.Gerar War
2.Publicar o war



TODO:
.Mensagem para rota nao definida
.Injentar codigo (CDI) - retirar o acoplamento 
.Montar teste unitario
.Montar um Mapper para DTO e nao usar as classes do servi�o SOA