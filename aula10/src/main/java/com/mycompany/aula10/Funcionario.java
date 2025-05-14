package com.mycompany.aula10;
public class Funcionario extends Pessoa{
    //Atributos
    private String setor;
    private boolean trabalhando;

    //Construtor
    public Funcionario(String nome, int idade, String sexo, String setor) {
        super(nome, idade, sexo);
        this.setor = setor;
        this.trabalhando = true;
    }
    
    //Métodos
    public void mudarTrabalho(String s){
        this.setor = s;
    }
    
    //get e Set

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean isTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }
    
    
}
