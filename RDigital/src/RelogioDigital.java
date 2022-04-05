

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author helder
 */
public class RelogioDigital {
    
    //Campos
    private Contador horas;
    private Contador minutos;
    private String separador;
    
    //Construtores
    public RelogioDigital() {
        horas = new Contador(24);
        minutos = new Contador(60);
        separador = ":";
    }

    public RelogioDigital(int horas, int minutos) {
        this.horas = new Contador(horas, 24);
        this.minutos = new Contador(minutos, 60);
        this.separador = ":";
    }
    
    
        
    //Métodos
    public String obtemHoraMinuto(){
//        String hora = horas.getStringValor();
//        String minuto = minutos.getStringValor();
        return formataHoraMinuto(horas.getStringValor(), 
                                minutos.getStringValor(), 
                                separador);
    }
    
    private String formataHoraMinuto(String hora, String minuto, String sep){
        return hora + sep + minuto;
    }
    
    /**
     * Incrementa o relógio em 1 (um) minuto
     */
    public void ticTac(){
        minutos.incrementa();
        if(minutos.getValor()==0)
            horas.incrementa();
    }
    public void acertaRelogio(int hora, int minuto){
        horas.setValor(hora);
        minutos.setValor(minuto);
    }
    
}
