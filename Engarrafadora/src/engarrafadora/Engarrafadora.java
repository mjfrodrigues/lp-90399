/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package engarrafadora;

/**
 *
 * @author mjfr
 */
public class Engarrafadora {

    private Deposito agua_mineral;
    private Deposito sumo_com_gas;
    private String separador;
    private int garrafas_agua;
    private int garrafas_sumo;
    
    public Engarrafadora() {
        this.agua_mineral = new Deposito(1, 1000);
        this.sumo_com_gas = new Deposito((float) 0.33, 500);
        this.garrafas_agua = 0;
        this.garrafas_sumo = 0;
    }

    public Engarrafadora(float volume_garrafa_agua, float volume_garrafa_sumo) {
        this.agua_mineral = new Deposito(volume_garrafa_agua, 1000);
        this.sumo_com_gas = new Deposito(volume_garrafa_sumo, 500);
        this.garrafas_agua = 0;
        this.garrafas_sumo = 0;
    }
    
    public Engarrafadora(float volume_garrafa_agua, float volume_garrafa_sumo,
                         int capacidade_dep_agua, int capacidade_dep_sumo) {
        this.agua_mineral = new Deposito(volume_garrafa_agua, capacidade_dep_agua);
        this.sumo_com_gas = new Deposito(volume_garrafa_sumo, capacidade_dep_sumo);
        this.garrafas_agua = 0;
        this.garrafas_sumo = 0;
    }

    public String obtemGarrafasCapacidade() {
        return this.garrafas_agua + " garrafas de água enchidas de " + 
               this.agua_mineral.getVolumeGarrafa() + " litro(s)."+
               " Total no deposito: "+this.agua_mineral.getVolumeExistente()+" litros\n"+
               this.garrafas_sumo  + " garrafas de sumo enchidas de " + 
               this.sumo_com_gas.getVolumeGarrafa() + " litro(s)." +
               " Total no deposito: "+this.sumo_com_gas.getVolumeExistente()+" litros\n";
    }

    public void encheGarrafaAgua() {
        if (this.agua_mineral.encheGarrafa())
            this.garrafas_agua++;
        
    }
    
    public void encheGarrafaSumo() {
        if (this.sumo_com_gas.encheGarrafa())
            this.garrafas_sumo++;
    }

    public void abastece(int agua, int sumo) {
        this.agua_mineral.abastece(agua);
        this.sumo_com_gas.abastece(sumo);
    }
    
}
