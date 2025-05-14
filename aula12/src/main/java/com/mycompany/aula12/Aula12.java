package com.mycompany.aula12;
public class Aula12 {
    public static void main(String[] args) {
    Mamifero m = new Mamifero();
    Reptil r = new Reptil();
    Peixe p = new Peixe();
    Ave a = new Ave();

    // Setando valores
    m.setPeso(35.5f);
    m.setIdade(5);
    m.setMembros(4);
    m.setCorPelo("Marrom");

    a.setCorPena("Azul");
    r.setCorEscama("Verde");
    p.setCorEscama("Prateada");

    // Executando ações
    System.out.println("Mamífero:");
    m.locomover();
    m.alimentar();
    m.emitirSom();
    
    System.out.println("\nAve:");
    a.locomover();
    a.alimentar();
    a.emitirSom();
    a.fazerNinho();

    System.out.println("\nReptil:");
    r.locomover();
    r.alimentar();
    r.emitirSom();

    System.out.println("\nPeixe:");
    p.locomover();
    p.alimentar();
    p.emitirSom();
    p.soltarBolha();
    }
}    