package com.mycompany.desafiogpt4;
public class DesafioGPT4 {
    public static void main(String[] args) {
        Filme f1 = new Filme("Shrek", "ze da cabra", 148, 0);
        Espectador e1 = new Espectador("Pedro", 18);
        Espectador e2 = new Espectador("Maikon", 20);

        Avaliacao a1 = new Avaliacao(f1, e1);
        Avaliacao a2 = new Avaliacao(f1, e2);

        a1.avaliar(8);
        a2.avaliar(10);

        System.out.println("Nota média: " + f1.getNotaMedia());
    }
}
