
package org.tempuri;

import java.math.BigDecimal;
public class Produto {

    protected int idProduto;
    protected String nVlPeso;
    protected int nCdFormato;
    protected BigDecimal nVlComprimento;
    protected BigDecimal nVlAltura;
    protected BigDecimal nVlLargura;
    protected BigDecimal nVlDiametro;

  
    public int getidProduto() {
        return idProduto;
    }

    
    public void setidProduto(int value) {
        this.idProduto = value;
    }

   
    public String getnVlPeso() {
        return nVlPeso;
    }

   
    public void setnVlPeso(String value) {
        this.nVlPeso = value;
    }

   
    public int getnCdFormato() {
        return nCdFormato;
    }

  
    public void setnCdFormato(int value) {
        this.nCdFormato = value;
    }

   
    public BigDecimal getnVlComprimento() {
        return nVlComprimento;
    }

    
    public void setnVlComprimento(BigDecimal value) {
        this.nVlComprimento = value;
    }

    
    public BigDecimal getnVlAltura() {
        return nVlAltura;
    }

   
    public void setnVlAltura(BigDecimal value) {
        this.nVlAltura = value;
    }

  
    public BigDecimal getnVlLargura() {
        return nVlLargura;
    }

    
    public void setnVlLargura(BigDecimal value) {
        this.nVlLargura = value;
    }

   
    public BigDecimal getnVlDiametro() {
        return nVlDiametro;
    }

   
    public void setnVlDiametro(BigDecimal value) {
        this.nVlDiametro = value;
    }

}
