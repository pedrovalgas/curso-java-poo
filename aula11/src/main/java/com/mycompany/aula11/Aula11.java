package com.mycompany.aula11;
public class Aula11 {
    public static void main(String[] args) {
        //Pessoa p1 = new Pessoa(); ----> erro por ser abstract
        Visitante v1 = new Visitante();
        v1.setNome("Jonas");
        v1.setIdade(22);
        v1.setSexo("M");
        System.out.println(v1.toString());
        
        Aluno a1 = new Aluno();
        a1.setNome("Eduardo");
        a1.setMatricula(1111);
        a1.setCurso("Informática");
        a1.setIdade(16);
        a1.setSexo("M");
        System.out.println(a1.toString());
        
        Bolsista b1 = new Bolsista();
        b1.setNome("Fernanda");
        b1.setIdade(15);
        b1.setSexo("F");
        b1.setMatricula(2222);
        b1.setCurso("Gerais");
        b1.pagarMensalidade();
        System.out.println(b1.toString());
    }
}
