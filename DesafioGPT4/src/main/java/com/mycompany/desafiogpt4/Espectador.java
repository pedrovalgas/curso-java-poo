package com.mycompany.desafiogpt4;
public class Espectador {
    //Atributos
    private String nome;
    private int idade;

    //Construtor
    public Espectador(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
    
    //Get e Set
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    
}
