package com.mycompany.desafiogpt;
public class DesafioGPT {

    public static void main(String[] args) {
        
        //Criando usuario
        Usuario p1 = new Usuario("Pedro", "plpvalgas@gmail.com", "teste");
        p1.fazerLogin("plpvalgas@gmail.com", "teste");
        
        //Erro de senha
        Usuario p2 = new Usuario("Ana", "analegal@yahoo.com.br", "teste2");
        p2.fazerLogin("analegal@yahoo.com.br", "teste1");
        
        
        p1.status();
        
        System.out.println("---------------------");
        
        p2.status();
    }
}
