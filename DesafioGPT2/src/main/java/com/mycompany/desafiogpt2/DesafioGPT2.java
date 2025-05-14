package com.mycompany.desafiogpt2;
public class DesafioGPT2 {
    public static void main(String[] args) {
        Banco c1 = new Banco();
        c1.setDono("Pedro");
        c1.depositar(500);
        c1.sacar(200);
        c1.sacar(400);
        System.out.println("Dono: " + c1.getDono());
        System.out.println("Saldo Atual: " + c1.getSaldo());
        
    }
}
