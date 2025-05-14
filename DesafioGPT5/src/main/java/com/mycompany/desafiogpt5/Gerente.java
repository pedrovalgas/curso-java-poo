package com.mycompany.desafiogpt5;
public class Gerente extends Funcionario{
    //Atributos
    private String departamento;
    
    //Métodos
    @Override
    public void receberSalario() {
        this.setSalario(this.getSalario() * 1.20);
        System.out.println("aplicando bônus de 20%...");
        System.out.println("R$" + this.getSalario() + " Depositado!");
    }
    
    //get e Set
    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    
    
}
