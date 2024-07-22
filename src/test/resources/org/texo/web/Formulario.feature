#language: pt

Funcionalidade:  Enviar contato

  @web
  Cenario: Enviar contato atraves do formulario de contato
    Dado que acesso a pagina "https://www.gft.com/br/pt/contact-gft#contact"
    E preencha o formulario na página
    Quando clico no botao enviar
    Então valido que o contato foi enviado corretamente
