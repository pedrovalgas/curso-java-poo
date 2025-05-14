package com.mycompany.banco;
public class ContaBanco {
    //Atributos
    private String dono;
    protected String tipo; // cc = corente (ganha 50 reais ao abrir a conta)/ cp = popuança (ganha 150 reais ao abrir a conta)
    private float saldo;
    public int numConta;
    private boolean status;

    // Método construtor
    public ContaBanco() {
        this.saldo = 0;
        this.status = false;
    }

    
    //Métodos especiais
    public String getDono() {
        return dono;
    }

    public void setDono(String d) {
        this.dono = d;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String t) {
        this.tipo = t;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float s) {
        this.saldo = s;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int n) {
        this.numConta = n;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean s) {
        this.status = s;
    }
 
    
    
    // Métodos
    public void abrirConta(String t){
        setTipo(t);
        setStatus(true);
        if (t.equals("CC")){
            setSaldo(50);
        }else if (t.equals("CP")){
            setSaldo(150);
        }
    }
    
    public void fecharConta(){
        if (saldo > 0){
            System.out.println("ERRO! Ainda há dinheiro na conta!");
        }else if (saldo < 0){
            System.out.println("ERRO! Você está devendo!");
        }else{
            setStatus(false);
        }
        
    }
    
    public void depositar(float v){
        if (status == true){
            saldo = saldo + v;
        }else{
            System.out.println("ERRO! Sua conta está fechada!");
        }
    }
    
    public void sacar(float v){
        if (status == true){
            if(saldo > v){
                saldo = saldo - v;
            }else{
                System.out.println("Saldo insuficiente!");
            }
        }else{
            System.out.println("ERRO! Sua conta não existe!");
        }
    }
    
    public void pagarMensal(){
        if(status == true){
            if(tipo.equals("CC")){
                if(saldo >= 12){
                    saldo = saldo - 12;
                }else{
                    System.out.println("Saldo insuficiente!");
                }
            }else if(tipo.equals("CP")){
                if(saldo >= 5){
                    saldo = saldo - 5;
                }else{
                    System.out.println("Saldo insuficiente!");
                }
            }
        }else{
            System.out.println("ERRO! Conta inexistente!");
        }
    }
    
    public void status(){
        System.out.println("---------------------");
        System.out.println("STATUS DA CONTA: ");
        System.out.println("Dono: " + this.dono);
        System.out.println("Saldo: " + this.saldo);
        System.out.println("Numero da conta: " + this.numConta);
        System.out.println("Tipo da conta: " + this.tipo);
        System.out.println("Status: " + this.status);
        
    }
    
}
