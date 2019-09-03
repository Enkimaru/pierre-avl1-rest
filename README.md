WebService REST com conexão à API dos Correios

Request e Response baseados na estrutura da documentação dos Correios:<br>
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

Como resposta é gerado um **resultadoProduto** com o **idProduto** referente a cada produto enviado:

```
{
    "resultadoProduto": [
        {
            "idProduto": 17,
            "servicos": {
                "cservico": [
                    {
                        "codigo": 40010,
                        "valor": "35,85",
                        "prazoEntrega": "1",
                        "valorMaoPropria": "0,00",
                        "valorAvisoRecebimento": "5,75",
                        "valorValorDeclarado": "0,00",
                        "entregaDomiciliar": "S",
                        "entregaSabado": "S",
                        "erro": "0",
                        "msgErro": "",
                        "valorSemAdicionais": "30,10",
                        "obsFim": "",
                        "dataMaxEntrega": null,
                        "horaMaxEntrega": null
                    },
                    {
                        "codigo": 41106,
                        "valor": "32,95",
                        "prazoEntrega": "5",
                        "valorMaoPropria": "0,00",
                        "valorAvisoRecebimento": "5,75",
                        "valorValorDeclarado": "0,00",
                        "entregaDomiciliar": "S",
                        "entregaSabado": "N",
                        "erro": "0",
                        "msgErro": "",
                        "valorSemAdicionais": "27,20",
                        "obsFim": "",
                        "dataMaxEntrega": null,
                        "horaMaxEntrega": null
                    }
                ]
            }
        },
        {
            "idProduto": 8,
            "servicos": {
                "cservico": [
                    {
                        "codigo": 40010,
                        "valor": "26,95",
                        "prazoEntrega": "1",
                        "valorMaoPropria": "0,00",
                        "valorAvisoRecebimento": "5,75",
                        "valorValorDeclarado": "0,00",
                        "entregaDomiciliar": "S",
                        "entregaSabado": "S",
                        "erro": "0",
                        "msgErro": "",
                        "valorSemAdicionais": "21,20",
                        "obsFim": "",
                        "dataMaxEntrega": null,
                        "horaMaxEntrega": null
                    },
                    {
                        "codigo": 41106,
                        "valor": "25,55",
                        "prazoEntrega": "5",
                        "valorMaoPropria": "0,00",
                        "valorAvisoRecebimento": "5,75",
                        "valorValorDeclarado": "0,00",
                        "entregaDomiciliar": "S",
                        "entregaSabado": "N",
                        "erro": "0",
                        "msgErro": "",
                        "valorSemAdicionais": "19,80",
                        "obsFim": "",
                        "dataMaxEntrega": null,
                        "horaMaxEntrega": null
                    }
                ]
            }
        }
    ]
}
```
