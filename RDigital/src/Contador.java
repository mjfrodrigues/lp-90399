/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class Contador {
    
    private int valor;
    private int LIMITE_MAXIMO; //Exclusive. Quando a contagem chega a este valor deve passar para o valor 0 (zero)

    
    public int getValor() {
        return valor;
    }
    
    public String getStringValor(){
        return String.format("%02d", valor);
    }
    
    public void incrementa(){
        setValor(LIMITE_MAXIMO);
        valor = (valor+1) % LIMITE_MAXIMO;
    }

    public void reset(){
        this.valor = 0;
    }
    
    public void setValor(int valor) {
        if((valor>=0) || (valor<LIMITE_MAXIMO)) this.valor = valor;
    }
    
    public Contador(int maximo) {
        iniciaContador(0, maximo);
    }

    public Contador() {
        iniciaContador(0, 60);
    }
    
    public Contador(int valor, int maximo){
        setValor(valor);
        iniciaContador(valor, maximo);
    }
    
    private void iniciaContador(int valor, int maximo){
        setValor(LIMITE_MAXIMO);
        this.LIMITE_MAXIMO = maximo;
    }
    
}
