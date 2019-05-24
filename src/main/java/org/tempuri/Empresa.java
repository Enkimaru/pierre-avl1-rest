package org.tempuri;

import java.math.BigDecimal;

public class Empresa {

    protected String nCdEmpresa;
    protected String sDsSenha;
    protected String sCepOrigem;
    protected String sCepDestino;
    protected String sCdAvisoRecebimento;
    protected BigDecimal nVlValorDeclarado;
    protected String sCdMaoPropria;

    
    public String getnCdEmpresa() {
        return nCdEmpresa;
    }

    
    public void setnCdEmpresa(String value) {
        this.nCdEmpresa = value;
    }

    
    public String getsDsSenha() {
        return sDsSenha;
    }

   
    public void setsDsSenha(String value) {
        this.sDsSenha = value;
    }

    
    public String getsCepOrigem() {
        return sCepOrigem;
    }

    
    public void setsCepOrigem(String value) {
        this.sCepOrigem = value;
    }

    
    public String getsCepDestino() {
        return sCepDestino;
    }

   
    public void setsCepDestino(String value) {
        this.sCepDestino = value;
    }

    
    public String getsCdAvisoRecebimento() {
        return sCdAvisoRecebimento;
    }

    
    public void setsCdAvisoRecebimento(String value) {
        this.sCdAvisoRecebimento = value;
    }

   
    public BigDecimal getnVlValorDeclarado() {
        return nVlValorDeclarado;
    }

    public void setnVlValorDeclarado(BigDecimal value) {
        this.nVlValorDeclarado = value;
    }

   
    public String getsCdMaoPropria() {
        return sCdMaoPropria;
    }


    public void setsCdMaoPropria(String value) {
        this.sCdMaoPropria = value;
    }

}
