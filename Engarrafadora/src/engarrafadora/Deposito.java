/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package engarrafadora;

/**
 *
 * @author mjfr
 */
public class Deposito {
    private float volume_garrafa; //taxa a que o depósito descarrega
    private float volume_existente; //volume de líquido existente
    private int CAPACIDADE; //capacidade máxima do tanque

    public float getVolumeGarrafa() {
        return volume_garrafa;
    }
    
    public float getVolumeExistente() {
        return volume_existente;
    }
    
    public float abastece(float volume){
        float v_livre = CAPACIDADE - volume_existente;
        if (volume <= v_livre) {
            volume_existente = volume;
            return 0;
        }
        volume_existente = CAPACIDADE;
        return volume-v_livre;
    }

    public boolean encheGarrafa(){
        if (volume_existente < volume_garrafa)
            return false;
        volume_existente -= volume_garrafa;
        return true;
    }
    
    public Deposito(int volume_deposito) {
        iniciaDeposito(1, volume_deposito);
    }

    public Deposito() {
        iniciaDeposito(1, 1000);
    }
    
    public Deposito(float volume_garrafa, int volume_deposito) {
        iniciaDeposito(volume_garrafa, volume_deposito);
    }

    private void iniciaDeposito(float volume_garrafa, int volume_deposito){
        this.CAPACIDADE = volume_deposito;
        this.volume_garrafa = volume_garrafa;
        this.volume_existente = 0;
        abastece(volume_garrafa);
    }
}
