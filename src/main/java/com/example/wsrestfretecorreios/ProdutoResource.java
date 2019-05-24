package com.example.wsrestfretecorreios;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.tempuri.ProdutoRequest;
import org.tempuri.ProdutoResponse;

@RestController
@RequestMapping(value="/apirest")
public class ProdutoResource {
    private ProdutoRepository produtoRepository = new ProdutoRepository();

    @PostMapping("/frete")
    public ProdutoResponse getProduto(@RequestBody ProdutoRequest request) {
        return produtoRepository.getProdutoResponse(request);
    }

} 