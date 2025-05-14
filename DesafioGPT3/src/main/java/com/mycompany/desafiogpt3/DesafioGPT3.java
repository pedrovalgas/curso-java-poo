package com.mycompany.desafiogpt3;
public class DesafioGPT3 {
    public static void main(String[] args) {
        ContaCorrente c1 = new ContaCorrente("123");
        c1.setNome("Pedro");
        c1.depositar(500);
        c1.sacar(300, "123");
        c1.sacar(50, "111");
        
        System.out.println("---- STATUS ----");
        System.out.println("Dono da conta: " + c1.getNome());
        System.out.println("Saldo atual: " + c1.getSaldo());
    }
}
