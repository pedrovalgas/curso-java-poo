package com.mycompany.desafiogpt5;
public class Estagiario extends Funcionario{
    //Atributos
    private int duracaoEstagio;
    
    //Métodos
    @Override
    public void receberSalario() {
        this.setSalario(1000);
        System.out.println("R$" + this.getSalario() + " Depositado!");
    }
    
    public void renovarEstagio(){
        System.out.println("Estágio renovado!");
    }
    
    //Get e Set
    public int getDuracaoEstagio() {
        return duracaoEstagio;
    }

    public void setDuracaoEstagio(int duracaoEstagio) {
        this.duracaoEstagio = duracaoEstagio;
    }
    
}
