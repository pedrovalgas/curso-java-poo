package com.mycompany.aula04;
public class Personagem {
    private String nome;
    private float vida;

    public Personagem(String nome, float vida) {
        this.nome = nome;
        this.vida = vida;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getVida() {
        return vida;
    }

    public void setVida(float vida) {
        this.vida = vida;
    }
       
    public void status(){
        System.out.println("PERSONAGEM: ");
        System.out.println("Nome: " + this.nome);
        System.out.println("Vida: " + this.vida);
        
    }

}
