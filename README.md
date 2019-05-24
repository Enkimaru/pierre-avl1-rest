WebService REST com conexão à API dos Correios

Request e Reponse baseados na estrutura da documentação dos Correios:<br>
https://www.correios.com.br/a-a-z/pdf/calculador-remoto-de-precos-e-prazos/manual-de-implementacao-do-calculo-remoto-de-precos-e-prazos/view

JSON de Request consiste em 2 partes, dados fixos dentro do atributo **empresa**:
```
"empresa": {
         "nCdEmpresa": "",
         "sDsSenha": "",
         "sCepOrigem": "96200380",
         "sCepDestino": "96200100",
         "sCdAvisoRecebimento": "S",
         "nVlValorDeclarado": "0",
         "sCdMaoPropria": "N"
      }
```

E uma lista de produtos dentro do atributo **produto**:
(É adicionado um **idProduto** para ser identificar qual produto está sendo referenciado na resposta)
```
"produto": [
         {
            "idProduto": 17,
            "nVlPeso": "5",
            "nCdFormato": "1",
            "nVlComprimento": "18",
            "nVlAltura": "16",
            "nVlLargura": "16",
            "nVlDiametro": "16"
         },
         {
            "idProduto": 8,
            "nVlPeso": "1",
            "nCdFormato": "1",
            "nVlComprimento": "16",
            "nVlAltura": "16",
            "nVlLargura": "16",
            "nVlDiametro": "16"
         }
      ]
```
