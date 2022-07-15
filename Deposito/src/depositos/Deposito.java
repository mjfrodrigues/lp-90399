/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package depositos;

/**
 *
 * @author mjfr
 */
public class Deposito {

    private Tanque principal;
    private Tanque reserva;
    private String separador;
    private float taxa_de_saida;
    
    public Deposito() {
        this.principal = new Tanque(100000);
        this.reserva = new Tanque(20000);
        this.taxa_de_saida = 20;
    }

    public Deposito(float litros_por_segundo) {
        this.principal = new Tanque(100000);
        this.reserva = new Tanque(20000);
        this.taxa_de_saida = litros_por_segundo;
    }
    
    public Deposito(float litros_por_segundo, int capacidade_tanque_principal,
            int capacidade_tanque_reserva) {
        this.principal = new Tanque(capacidade_tanque_principal);
        this.reserva = new Tanque(capacidade_tanque_reserva);
        this.taxa_de_saida = litros_por_segundo;
    }

    public String obtemRelatorio() {
        return "Após esvaziar "+this.taxa_de_saida+" litros ficamos com:\n"+
               "\tdeposito principal --> "+this.principal.getVolumeExistente()+" litros\n"+
               "\tdeposito de reserva --> "+this.reserva.getVolumeExistente()+" litros\n";
    }

    public boolean abreUmSegundo() throws InterruptedException {
        Thread.sleep(1000); //Aguarda 1 segundo
        if (principal.getVolumeExistente() >= this.taxa_de_saida) {//o principal tem volume suficiente. Esvaziar
            principal.esvazia(this.taxa_de_saida);
            return true;
        }
        //o principal não tem volume suficiente. Esvaziar o que está no principal e começar a esvaziar a reserva
        float v_principal = principal.getVolumeExistente();
        principal.esvazia(v_principal);
        return reserva.esvazia(this.taxa_de_saida - principal.getVolumeExistente());
    }

    public void abastece(int principal, int reserva) {
        this.principal.abastece(principal);
        this.reserva.abastece(reserva);
    }
    
}
