package com.mycompany.aula04;
public class Aula04 {

    public static void main(String[] args) {
        Personagem p = new Personagem("Pedro", 80);
        // p.setNome("Pedro");
        // p.setVida(80f);
        p.status();
        
        Personagem p2 = new Personagem("Taynara", 50);
        p2.status();
    }
}
