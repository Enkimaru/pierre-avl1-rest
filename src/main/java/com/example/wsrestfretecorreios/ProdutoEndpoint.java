package com.example.wsrestfretecorreios;

import com.example.wsrestfretecorreios.ProdutoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import org.tempuri.ProdutoRequest;
import org.tempuri.ProdutoResponse;

@Endpoint
public class ProdutoEndpoint {
    private static final String NAMESPACE_URI = "http://tempuri.org/";

    private ProdutoRepository produtoRepository;
    

    @Autowired
    public ProdutoEndpoint(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "ProdutoRequest")
    @ResponsePayload
    public ProdutoResponse getProduto(@RequestPayload ProdutoRequest request) {
        return produtoRepository.getProdutoResponse(request);
    }
}