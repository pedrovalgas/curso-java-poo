package com.mycompany.desafiogpt4;
public class Avaliacao {
    //Atributos
    private Filme filme;
    private Espectador espectador;

    //Construtor
    public Avaliacao(Filme filme, Espectador espectador) {
        this.filme = filme;
        this.espectador = espectador;
    }

    //Método de avaliação
    public void avaliar(int nota){
        //Sistema que atualiza a média do filme
        System.out.println(espectador.getNome() + " avaliou o filme \"" + filme.getTitulo() + "\" com nota " + nota);
        filme.receberAvaliacao(nota);
    }
}
