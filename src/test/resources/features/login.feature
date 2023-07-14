# language: pt

@login
Funcionalidade: Tentativa de Login

  Eu com cliente do site Ebac
  desejo fazer login
  para que eu possa acessar o site e fazer compras

  Contexto: Acesso a tela de login
    Dado que eu esteja na página de login do site ebac

  @login-sucesso
  Cenário: login com sucesso
    Quando insiro meu email e senha
    E clico no botão login
    Então eu vejo minha conta

  @login-senha-errada
  Cenário: senha errada
    Quando insiro meu email e senha errada
    E clico no botão login
    Então eu vejo a mensagem de erro

  @login-email-errado
  Cenário: email errado
    Quando insiro meu email errado e senha
    E clico no botão login
    Então eu vejo a mensagem de erro de email

