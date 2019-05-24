package com.example.wsrestfretecorreios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.stereotype.Component;
import org.tempuri.CResultadoProduto;
import org.tempuri.CalcPrecoPrazo;
import org.tempuri.CalcPrecoPrazoResponse;
import org.tempuri.Empresa;
import org.tempuri.Produto;
import org.tempuri.ProdutoRequest;
import org.tempuri.ProdutoResponse;

@Component
public class ProdutoRepository { 
    @Autowired SOAPConnector soapConnector = new SOAPConnector();

    public ProdutoResponse getProdutoResponse (ProdutoRequest produtoRequest){
        ProdutoResponse produtoResponse = new ProdutoResponse();

        Empresa empresa = produtoRequest.getEmpresa();

        List<Produto> listaProdutos = produtoRequest.getProduto();

        for (Produto produto : listaProdutos) {
            CResultadoProduto cResultadoProduto = new CResultadoProduto();
            CalcPrecoPrazoResponse calcPrecoPrazoResponse = new CalcPrecoPrazoResponse();
            
            CalcPrecoPrazo calcPrecoPrazo = new CalcPrecoPrazo();
            calcPrecoPrazo = calcPrecoPrazoSetEmpresa(calcPrecoPrazo, empresa);
            calcPrecoPrazo = calcPrecoPrazoSetProduto(calcPrecoPrazo, produto);

            calcPrecoPrazoResponse = findCalcPrecoPrazoResponse(calcPrecoPrazo);

            cResultadoProduto.setServicos(calcPrecoPrazoResponse.getCalcPrecoPrazoResult().getServicos());
            cResultadoProduto.setIdProduto(produto.getidProduto());

            produtoResponse.getResultadoProduto().add(cResultadoProduto);
        }
         
        return produtoResponse;
    }
 
    public CalcPrecoPrazoResponse findCalcPrecoPrazoResponse(CalcPrecoPrazo request) {
        request.setNCdServico("40010,41106");

        if (request.getNCdEmpresa() == null){
            request.setNCdEmpresa("");
        };

        if (request.getSDsSenha() == null){
            request.setSDsSenha("");
        };
        
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setContextPath("org.tempuri");
        soapConnector.setDefaultUri("http://ws.correios.com.br/calculador/CalcPrecoPrazo.asmx");
        soapConnector.setMarshaller(marshaller);
        soapConnector.setUnmarshaller(marshaller);

        CalcPrecoPrazoResponse response =(CalcPrecoPrazoResponse) soapConnector.callWebService("http://tempuri.org/CalcPrecoPrazo", request);
        return response;
    }

    public CalcPrecoPrazo calcPrecoPrazoSetEmpresa (CalcPrecoPrazo calcPrecoPrazo, Empresa empresa) {
        calcPrecoPrazo.setNCdEmpresa(empresa.getnCdEmpresa());
        calcPrecoPrazo.setSDsSenha(empresa.getsDsSenha());
        calcPrecoPrazo.setSCepOrigem(empresa.getsCepOrigem());
        calcPrecoPrazo.setSCepDestino(empresa.getsCepDestino());
        calcPrecoPrazo.setSCdAvisoRecebimento(empresa.getsCdAvisoRecebimento());
        calcPrecoPrazo.setNVlValorDeclarado(empresa.getnVlValorDeclarado());
        calcPrecoPrazo.setSCdMaoPropria(empresa.getsCdMaoPropria());
        return calcPrecoPrazo;
    }

    public CalcPrecoPrazo calcPrecoPrazoSetProduto (CalcPrecoPrazo calcPrecoPrazo, Produto produto) {
        calcPrecoPrazo.setNVlPeso(produto.getnVlPeso());
        calcPrecoPrazo.setNCdFormato(produto.getnCdFormato());
        calcPrecoPrazo.setNVlComprimento(produto.getnVlComprimento());
        calcPrecoPrazo.setNVlAltura(produto.getnVlAltura());
        calcPrecoPrazo.setNVlLargura(produto.getnVlLargura());
        calcPrecoPrazo.setNVlDiametro(produto.getnVlDiametro());
        return calcPrecoPrazo;
    }
}