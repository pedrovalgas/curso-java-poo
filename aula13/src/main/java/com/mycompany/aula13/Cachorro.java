package com.mycompany.aula13;
public class Cachorro extends Lobo{
   
    
    @Override
    public void emitirSom() {
        System.out.println("Au! Au! Au!");
    }
    
    public void reagir(String frase){
        if(frase.equals("Toma comida!") || frase.equals("Olá")){
            System.out.println("Abanar e latir!");
        }else{
            System.out.println("Rosnar!");
        }
    }
    
    public void reagir(int hora, int minuto){
    if(hora < 12){
        System.out.println("Cachorro animado pela manhã");
    }else if(hora >= 18){
        System.out.println("Cachorro desanimado à noite");
    }else{
        System.out.println("Cachorro neutro à tarde");
    }
}
    
    public void reagir(boolean dono){
        if(dono == true){
            System.out.println("abanar");
        }else{
            System.out.println("rosnar e latir");
        }
    }
    
    public void reagir(int idade, float peso){
        if(idade < 5){
            if(peso < 10){
                System.out.println("abanar");
            }else{
                System.out.println("latir");
            }
        }else{
            if(peso > 10){
                System.out.println("Rosnar");
            }else{
                System.out.println("Ignorar");
            }
        }
            
    }
 
}
