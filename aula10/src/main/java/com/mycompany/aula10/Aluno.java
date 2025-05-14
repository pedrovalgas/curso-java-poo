package com.mycompany.aula10;
public class Aluno extends Pessoa {
    //Atributos
    private boolean matriculado;
    private String curso;

    //Construtor
    public Aluno(String nome, int idade, String sexo, String curso) {
        super(nome, idade, sexo);
        this.curso = curso;
        this.matriculado = true;
        
    }

    //Métodos
    public void cancelarMatr(){
        this.matriculado = false;
    }
    
    //Get e Set
    public boolean isMatriculado() {
        return matriculado;
    }

    public void setMatriculado(boolean matriculado) {
        this.matriculado = matriculado;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
}
