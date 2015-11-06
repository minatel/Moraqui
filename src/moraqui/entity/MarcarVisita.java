/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moraqui.entity;

/**
 *
 * @author Jéssica
 */
public class MarcarVisita {
    private static String idLocatario;
    private static String idMoradia;
    private static String data;
    private static String hora;
    private static String descricao;
    private String status;

    public void setVisita(String idlocatario, String idlocator, String data,String hora, String descricao, String Status){
        this.idLocatario = idlocatario;
        this.idMoradia = idlocator;
        this.data = data;
        this.hora = hora;
        this.descricao = descricao;
        this.status = status;
    }
    /**
     * @return the idLocatario
     */
    public String getIdLocatario() {
        return idLocatario;
    }

    /**
     * @param idLocatario the idLocatario to set
     */
    public void setIdLocatario(String idLocatario) {
        this.idLocatario = idLocatario;
    }

    /**
     * @return the idLocator
     */
    public String getIdMoradia() {
        return idMoradia;
    }

    /**
     * @param idLocator the idLocator to set
     */
    public void setIdMoradia(String idMoradia) {
        this.idMoradia = idMoradia;
    }

    /**
     * @return the datahora
     */
    public String getData() {
        return data;
    }

    /**
     * @param datahora the datahora to set
     */
    public void setData(String data) {
        this.data = data;
    }

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return the hora
     */
    public String getHora() {
        return hora;
    }

    /**
     * @param hora the hora to set
     */
    public void setHora(String hora) {
        this.hora = hora;
    }
    
    public boolean testeAnoInexistente(){
        if (Integer.parseInt(data.substring(0, 4)) <= 0)
            return false;
        return true;
    }
    
    public boolean testeMesInexistente(){
        if (Integer.parseInt(data.substring(5, 7)) <= 0)
            return false;
        return true;
    }
    
    public boolean testeDiaInexistente(){
        if (Integer.parseInt(data.substring(8, 10)) <= 0)
            return false;
        return true;
    }
    
    public boolean testeHoraInexistente(){
        if (Integer.parseInt(hora.substring(0, 2)) > 24)
            return false;
        return true;
    }
    
    public boolean testeMinutoInexistente(){
        if (Integer.parseInt(hora.substring(3, 6)) > 60)
            return false;
        return true;
    }
}
