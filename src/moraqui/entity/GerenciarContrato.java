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
public class GerenciarContrato {
    public String codContrato;
    public String codMoradia;
    public String codLocatario;

    public void setCodLocator(String codLocator) {
        this.codLocator = codLocator;
    }

    public String getCodLocator() {
        return codLocator;
    }
    public String codLocator;
    public String dataInicioContrato;
    public String dataTerminoContrato;
    public String especificacoes;
    public String valor;
    
    public void setContrato(String codContrato, String codMoradia, String codLocatario, String dataInicioContrato, String dataTerminoContrato, String especifacoes, String valor){
        this.codContrato = codContrato;
        this.codMoradia = codMoradia;
        this.codLocatario = codLocatario;
        this.dataInicioContrato = dataInicioContrato;
        this.dataTerminoContrato = dataTerminoContrato;
        this.especificacoes = especifacoes;
        this.valor = valor;
    }

    public void setValor(String valor){
        this.valor = valor;
    }
    public void setCodContrato(String codContrato) {
        this.codContrato = codContrato;
    }

    public void setCodMoradia(String codMoradia) {
        this.codMoradia = codMoradia;
    }

    public void setCodLocatario(String codLocatario) {
        this.codLocatario = codLocatario;
    }

    public void setDataInicioContrato(String dataInicioContrato) {
        this.dataInicioContrato = dataInicioContrato;
    }
    public void setDataTerminoContrato(String dataTerminoContrato) {
        this.dataTerminoContrato = dataTerminoContrato;
    }

    public void setEspecificacoes(String especificacoes) {
        this.especificacoes = especificacoes;
    }

    public String getValor() {
        return valor;
    }
    public String getCodContrato() {
        return codContrato;
    }

    public String getCodMoradia() {
        return codMoradia;
    }

    public String getCodLocatario() {
        return codLocatario;
    }

    public String getDataInicioContrato() {
        return dataInicioContrato;
    }
    public String getDataTerminoContrato() {
        return dataTerminoContrato;
    }

    public String getEspecificacoes() {
        return especificacoes;
    }

	public boolean testeAnoInexistente(){
        if (Integer.parseInt(dataInicioContrato.substring(0, 4)) <= 0)
            return false;
        return true;
    }
    
    public boolean testeMesInexistente(){
        if (Integer.parseInt(dataInicioContrato.substring(5, 7)) > 12)
            return false;
        return true;
    }
    
    public boolean testeDiaInexistente(){
        if (Integer.parseInt(dataInicioContrato.substring(8, 10)) > 31)
            return false;
        return true;
    }
    
    public boolean testeValorNegativo(){
        if (Integer.parseInt(valor) <= 0)
            return false;
        return true;
    }
    
}
