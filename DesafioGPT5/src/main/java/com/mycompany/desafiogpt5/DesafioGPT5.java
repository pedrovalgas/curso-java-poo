package com.mycompany.desafiogpt5;
    public class DesafioGPT5 {
    public static void main(String[] args) {
        // Programador
        Programador p1 = new Programador();
        p1.setNome("Lucas");
        p1.setIdade(25);
        p1.setSalario(5000);
        p1.setLinguagem("Java");
        p1.fazerAniversario();
        p1.receberSalario();
        System.out.println(p1.toString());
        System.out.println("Linguagem: " + p1.getLinguagem());
        System.out.println();

        // Gerente
        Gerente g1 = new Gerente();
        g1.setNome("Carla");
        g1.setIdade(40);
        g1.setSalario(8000);
        g1.setDepartamento("Financeiro");
        g1.fazerAniversario();
        g1.receberSalario();
        System.out.println(g1.toString());
        System.out.println("Departamento: " + g1.getDepartamento());
        System.out.println();

        // Estagiário
        Estagiario e1 = new Estagiario();
        e1.setNome("Rafael");
        e1.setIdade(19);
        e1.setDuracaoEstagio(6);
        e1.fazerAniversario();
        e1.receberSalario();
        e1.renovarEstagio();
        System.out.println(e1.toString());
        System.out.println("Duração do Estágio: " + e1.getDuracaoEstagio() + " meses");
    }
}
   
