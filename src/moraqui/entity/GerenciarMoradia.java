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
    public String endereco;
    public String cep;
    public String tipo;
    public String area;
    public String genero;
    public String quantMorador;
    public String valor;
    
    public void setMoradia(String endereco, String cep, String tipo, String area, String genero, String quantMorador, String valor){
        this.endereco = endereco;
        this.cep = cep;
        this.tipo = tipo;
        this.area = area;
        this.genero = genero;
        this.quantMorador = quantMorador;
        this.valor = valor;
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
    
}
