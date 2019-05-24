//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.7 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2019.05.24 às 02:14:38 PM BRT 
//


package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de cResultadoProduto complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="cResultadoProduto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idProduto" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Servicos" type="{http://tempuri.org/}ArrayOfCServico" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cResultadoProduto", propOrder = {
    "idProduto",
    "servicos"
})
public class CResultadoProduto {

    protected int idProduto;
    @XmlElement(name = "Servicos")
    protected ArrayOfCServico servicos;

    /**
     * Obtém o valor da propriedade idProduto.
     * 
     */
    public int getIdProduto() {
        return idProduto;
    }

    /**
     * Define o valor da propriedade idProduto.
     * 
     */
    public void setIdProduto(int value) {
        this.idProduto = value;
    }

    /**
     * Obtém o valor da propriedade servicos.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCServico }
     *     
     */
    public ArrayOfCServico getServicos() {
        return servicos;
    }

    /**
     * Define o valor da propriedade servicos.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCServico }
     *     
     */
    public void setServicos(ArrayOfCServico value) {
        this.servicos = value;
    }

}
