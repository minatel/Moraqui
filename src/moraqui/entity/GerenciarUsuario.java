/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moraqui.entity;

import java.util.Date;

/**
 *
 * @author Jessica Terada
 */
public class GerenciarUsuario {
    private String nome;
    private String rg;
    private String cpf;
    private String endreco;
    private String dataNascimento;
    private String cep;
    private String sexo;

    
    public void setUsuario(String nome, String rg, String cpf,String dataNascimento, String endereco, String cep, String sexo){
        this.nome = nome;
        this.rg = rg;
        this.cpf = cpf;
        this.endreco = endereco;
        this.sexo = sexo;
        this.cep = cep;
        this.dataNascimento = dataNascimento;
    
    }
    public String getNome() {
        return nome;
    }

    public String getRg() {
        return rg;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEndreco() {
        return endreco;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public String getCep() {
        return cep;
    }

    public String getSexo() {
        return sexo;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setEndreco(String endreco) {
        this.endreco = endreco;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    
}
