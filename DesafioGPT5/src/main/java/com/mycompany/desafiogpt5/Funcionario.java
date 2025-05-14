package com.mycompany.desafiogpt5;
public abstract class Funcionario {
    //Atributos
    private String nome;
    private int idade;
    private double salario;
    
    //Métodos
    public abstract void receberSalario();
    
    public void fazerAniversario(){
        this.idade++;
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

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Funcionario{" + "nome=" + nome + ", idade=" + idade + ", salario=" + salario + '}';
    }
    
    
}
