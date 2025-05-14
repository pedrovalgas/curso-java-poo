package com.mycompany.desafiogpt3;
public class ContaCorrente {
    //Atributos
    private String nome;
    private double saldo;
    private String senha;

    //Construtor
    public ContaCorrente(String senha) {
        this.senha = senha;
    }
    
    //Getters and Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getSenha() {
        return senha;
    }

    //Métodos
    public void depositar(double v){
        if(v > 0){
            saldo += v;
        }else{
            System.out.println("Impossível depositar!");
        }
    }
    
    public void sacar(double v, String senha){
        if(this.getSaldo() > v && senha.equals(this.getSenha())){
            saldo -= v;
        }else{
            System.out.println("Impossível sacar!");
        }
    }
}
