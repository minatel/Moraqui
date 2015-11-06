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
    private static String id;

    public static String getIdTipo() {
        return idTipo;
    }

    public static void setIdTipo(String idTipo) {
        GerenciarUsuario.idTipo = idTipo;
    }
    private static String idTipo;
    private String nome;
    private String rg;
    private String cpf;
    private String endreco;
    private String dataNascimento;
    private String cep;
    private String sexo;
    private String senha; 
    private static String tipo;
    private boolean situacao;
    private String alergias;
    private boolean fumante;


    public String getAlergias() {
        return alergias;
    }

    public boolean isFumante() {
        return fumante;
    }

    

    public void setFumante(boolean fumante) {
        this.fumante = fumante;
    }

    public static void setTipo(String tipo) {
        GerenciarUsuario.tipo = tipo;
    }
    
    public void setAlergias(String alergias){
        this.alergias = alergias;
    }

    public void setUsuario(String rg, String senha){
        this.rg = rg;
        this.senha = senha;
    }
    
    public void setUsuario(String nome, String rg, String cpf,String dataNascimento, String senha, String endereco, String cep, String sexo, String tipo){
        this.nome = nome;
        this.rg = rg;
        this.cpf = cpf;
        this.senha = senha;
        this.endreco = endereco;
        this.sexo = sexo;
        this.cep = cep;
        this.dataNascimento = dataNascimento;
        this.tipo = tipo;
        this.situacao = false;    
    }

    public static String getId(){
        return id;
    }
    
    public static String getTipo(){
        return tipo;
    }
    
    public String getSenha() {
        return senha;
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
    
    public boolean getSituacao(){
        return situacao;
    }
    
    public static void setId(String id){
        GerenciarUsuario.id = id;
    }
    
    public void setSenha(String senha) {
        this.senha = senha;
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

    public boolean TesteCepNegativo(){
        if(Integer.parseInt(cep) <= 0)
               return false;
        return true;
    }
    public boolean TesteRgNegativo(){
        if(Integer.parseInt(rg) <= 0)
               return false;
        return true;
    }
    public boolean TesteCpfNegativo(){
        if(Integer.parseInt(cpf) <= 0)
               return false;
        return true;
    }
    public boolean TesteSexoErrado(){
        if(sexo != "feminino" || sexo != "masculino" || sexo != "outros")
               return false;
        return true;
    }
    public boolean TesteTipoDiferente(){
        if(tipo != "locador" || sexo != "locatario" || sexo != "gerenciador")
               return false;
        return true;
    }
    public boolean TesteAnoDataNascZero(){
        if(Integer.parseInt(dataNascimento.substring(0, 4)) <=0 )
               return false;
        return true;
    }
    public boolean TesteMesDataNascZero(){
        if(Integer.parseInt(dataNascimento.substring(5, 7)) <=0 || Integer.parseInt(dataNascimento.substring(5, 7)) >= 13)
               return false;
        return true;
    }
    public boolean TesteDiaDataNascZero(){
        if(Integer.parseInt(dataNascimento.substring(8, 10)) <=0 || Integer.parseInt(dataNascimento.substring(8, 10)) >= 32)
               return false;
        return true;
    }
}
