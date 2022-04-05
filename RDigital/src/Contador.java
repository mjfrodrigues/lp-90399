/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Hélder Gomes
 */
public class Contador {
    
    //Campos
    private int valor;
    private int LIMITE_MAXIMO; //Exclusive. Quando a contagem chega a este valor deve passar para o valor 0 (zero)

    
    //Métodos

    /**
     * Obter o valor atual do contador.
     * @return valor atual do contador
     */
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
    
    //Construtores
    public Contador(int maximo) {
        //Inicia o contador para começar em zero e contar até ao valor máximo indicado
        iniciaContador(0, maximo);
    }

    public Contador() {
        //Inicia contador para iniciar a zero e contar até 60.
        iniciaContador(0, 60);
    }
    
    public Contador(int valor, int maximo){
        setValor(valor);
        iniciaContador(valor, maximo);
    }
    
    private void iniciaContador(int valor, int maximo){
        //Primeiro tem de se guardar o limite para depois se fazer corretamente a validação do valor
        this.LIMITE_MAXIMO = maximo;
        setValor(valor);
    }
    
}
