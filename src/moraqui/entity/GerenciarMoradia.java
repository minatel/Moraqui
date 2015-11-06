/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moraqui.entity;

/**
 *
 * @author Thayna
 */
public class GerenciarMoradia {
    public static String codMoradia;
    public static String codLocator;
    public static String endereco;
    public static String cep;
    public static String tipo;
    public static String area;
    public static String genero;
    public static String quantMorador;
    public static String valor;
    
    public void setMoradia(String codLocator, String endereco, String cep, String tipo, String area, String genero, String quantMorador, String valor){
        this.codLocator = codLocator;
        this.endereco = endereco;
        this.cep = cep;
        this.tipo = tipo;
        this.area = area;
        this.genero = genero;
        this.quantMorador = quantMorador;
        this.valor = valor;
    }
    
    public String getCodMoradia() {
        return codMoradia;
    }

    public void setCodMoradia(String codMoradia) {
        this.codMoradia = codMoradia;
    }

    public String getCodLocator() {
        return codLocator;
    }

    public void setCodLocator(String codLocator) {
        this.codLocator = codLocator;
    }
    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getQuantMorador() {
        return quantMorador;
    }

    public void setQuantMorador(String quantMorador) {
        this.quantMorador = quantMorador;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
    
    public boolean TesteCepNegativo(){
        if(Integer.parseInt(cep) <= 0)
               return false;
        return true;
    }
    public boolean TesteTipoMoradia(){
        if(tipo != "apartamento" || tipo != "casa" || tipo != "kitnet" || tipo != "republica")
               return false;
        return true;
    }
    public boolean TesteAreaNegativa(){
        if(Integer.parseInt(area)<=0)
            return false;
        return true;
    }
    public boolean TesteGeneroDiferente(){
        if(genero != "feminino" || genero != "masculino" || genero != "misto")
            return false;
        return true;
    }
    public boolean TesteQuantMoradores(){
        if(Integer.parseInt(quantMorador)<=0)
            return false;
        return true;
    }
    public boolean TesteValorNegativo(){
        if(Integer.parseInt(valor)<=0)
            return false;
        return true;
    }
}
