#language:pt
  @register #Roda tudo que estiver no projeto
  Funcionalidade: Como usuario do site Register eu
    desejo realizar um cadastro para validar se foi
    cadastrado com sucesso.

    @test001 #Roda somente o que eu quero.
    Cenario: Validar cadastro com secesso no site Register.
      Dado que eu acesso o site Register.
      Quando preencho o campo nome com um valor "Michell"
      E preencho o campo sobrenome com um valor "Melo"
      E preencho o campo do endereço com um valor " Alameda vicente cocoza nº1153 JD Sorocabano"
      E preencho o campo do Email com um valor "Michell.benfica2099@gmail.com"
      E preencho o numero do telefone com o valor "11947831489"
      E clico no checbox Male
      E clico no checbox Movies
      E seleciono a Skills "Java"
      E seleciono um country
      E seleciono o ano " 1988 ", o mês "June" e o dia "28"
      E preencho o campo Passwor com um valor "Benfica2099"
      E preencho o campo Confirmação com um valor "Benfica2099"

