WebService REST com conexão à API dos Correios

Request e Reponse baseados na estrutura da documentação dos Correios:<br>
https://www.correios.com.br/a-a-z/pdf/calculador-remoto-de-precos-e-prazos/manual-de-implementacao-do-calculo-remoto-de-precos-e-prazos/view

<br>
JSON de Request consiste em 2 partes, dados fixos que serão enviados junto de cada produto sendo eles:
```json
"empresa" : {
         "nCdEmpresa":,
         "sDsSenha":,
         "sCepOrigem":,
         "sCepDestino":,
         "sCdAvisoRecebimento":,
         "nVlValorDeclarado":,
         "sCdMaoPropria":
}
```
