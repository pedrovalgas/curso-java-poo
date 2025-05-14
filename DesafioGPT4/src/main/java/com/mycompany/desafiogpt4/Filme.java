package com.mycompany.desafiogpt4;
public class Filme {
    //Atributos
    private String titulo;
    private String diretor;
    private int tempo;
    private float notaMedia;
    private int totalAvaliacoes;
    private float somaNotas;
    
    
    //Construtor
    public Filme(String titulo, String diretor, int tempo, float notaMedia){
        this.titulo = titulo;
        this.diretor = diretor;
        this.tempo = tempo;
        this.notaMedia = notaMedia;
        
    }

    //Metodos
    public void status() {
        System.out.println("=== STATUS ===");
        this.getTitulo();
        this.getDiretor();
        this.getTempo();
    }
    
    public void receberAvaliacao(int nota){
        this.somaNotas += nota;
        this.totalAvaliacoes++;
        
    }
    //Get e Set
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public int getTempo() {
        return tempo;
    }

    public void setTempo(int tempo) {
        this.tempo = tempo;
    }

    public float getNotaMedia() {
        if (totalAvaliacoes == 0) return 0;
        return somaNotas / totalAvaliacoes;
    }

    public void setNotaMedia(float notaMedia) {
        this.notaMedia = notaMedia;
    }
    
    
}
