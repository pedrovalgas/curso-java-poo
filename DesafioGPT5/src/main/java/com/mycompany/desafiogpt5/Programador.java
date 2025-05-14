package com.mycompany.desafiogpt5;
public class Programador extends Funcionario{
    //Atributos
    private String linguagem;
    
    //Métodos
    @Override
    public void receberSalario() {
        System.out.println("R$" + this.getSalario() + " Depositado!");
    }

    //Get e Set
    public String getLinguagem() {
        return linguagem;
    }

    public void setLinguagem(String linguagem) {
        this.linguagem = linguagem;
    }
    
    
    
}
