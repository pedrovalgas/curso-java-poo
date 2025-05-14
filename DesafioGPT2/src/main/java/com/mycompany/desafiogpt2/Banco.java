package com.mycompany.desafiogpt2;
public class Banco {
    //Atributos
    private String dono;
    private double saldo;

    //Getters and Setters
    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public double getSaldo() {
        return saldo;
    }

    //Métodos
    public void depositar(double v){
        if(v > 0){
            saldo += v;
        }else{
            System.out.println("Impossível depositar!");
        }
    }
    
    public void sacar(double v){
        if(this.getSaldo() >= v){
            saldo -= v;
        }else{
            System.out.println("Impossível sacar!");
        }
    }
}
