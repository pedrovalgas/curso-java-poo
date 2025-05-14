package com.mycompany.aula07;
public class Aula07 {
    public static void main(String[] args) {
        Lutador[] lutadores = new Lutador[6];
        
        lutadores[0] = new Lutador(
                "Pedro",
                "Brasil",
                18,
                1.75f,
                65f,
                58,
                0,
                0
        );
        
        lutadores[1] = new Lutador(
                "Marcos",
                "Inglaterra",
                20,
                1.80f,
                69.34f,
                5,
                2,
                3
        
        );
        
        lutadores[2] = new Lutador(
                "Roberto",
                "França",
                32,
                1.22f,
                78.34f,
                22,
                11,
                33
        );
        
        lutadores[3] = new Lutador(
                "Luciano",
                "Finlandia",
                44,
                1.89f,
                83.2f,
                30,
                12,
                16
        );
        
        lutadores[4] = new Lutador(
                "Carlos",
                "EUA",
                45,
                1.32f,
                110.33f,
                9,
                22,
                30
        );
        
        lutadores[5] = new Lutador(
                "Beto",
                "Portugal",
                12,
                1.10f,
                119.32f,
                1,
                55,
                1
        );
        
        Luta UEC01 = new Luta();
        UEC01.marcarLuta(lutadores[3], lutadores[1]);
        UEC01.luta();
        
    }
}
