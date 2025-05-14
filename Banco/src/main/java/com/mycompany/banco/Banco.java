package com.mycompany.banco;
public class Banco {
    public static void main(String[] args) {
        //conta 1
       ContaBanco p1 = new ContaBanco();
       p1.setDono("Jubileu");
       p1.setNumConta(1111);
       p1.abrirConta("CC");
       
       //conta 2
       ContaBanco p2 = new ContaBanco();
       p2.setDono("Creusa");
       p2.setNumConta(2222);
       p2.abrirConta("CP");
       
       //depositar
       p1.depositar(300);
       p2.depositar(500);
       
       //saque da conta
       p2.sacar(100);
       
       
       //status das contas
       p1.status();
       
        System.out.println(" ");
       
       p2.status();
    }
}
