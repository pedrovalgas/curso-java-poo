package com.mycompany.desafiogpt;
public class Usuario {
    //Atributos
    private String nome;
    private String email;
    private String senha;
    private boolean logado;

    //Construtor
    public Usuario(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }
    
    //Métodos especiais
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean isLogado() {
        return logado;
    }

    public void setLogado(boolean logado) {
        this.logado = logado;
    }
    
    
    //Métodos
    public void fazerLogin(String email, String senha){
        if (email.equals(getEmail()) && senha.equals(getSenha())){
            logado = true;
            System.out.println("Seja bem vindo!");
        }else{
            System.out.println("Email ou senha inválidos");
        }
    }
    
    public void fazerLogout(){
        this.logado = false;
        
    }
    
    public void status(){
        System.out.println("Nome: " + nome);
        System.out.println("Logado: " + logado);
    }
    
    
    
}
