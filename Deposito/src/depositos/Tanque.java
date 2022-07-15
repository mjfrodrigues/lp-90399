/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package depositos;

/**
 *
 * @author mjfr
 */
public class Tanque {
    private float volume_existente; //volume de líquido existente
    private int CAPACIDADE; //capacidade máxima do Tanque

    public float getVolumeExistente() {
        return volume_existente;
    }
    
    public boolean esvazia(float litros) {
        if (volume_existente >= litros) {
            volume_existente -= litros;
            return true;
        }
        volume_existente = 0;
        return false;
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
    
    public Tanque(int capacidade) {
        iniciaTanque(capacidade);
    }

    public Tanque() {
        iniciaTanque(100000);
    }

    private void iniciaTanque(int capacidade){
        this.volume_existente = 0;
        abastece(capacidade);
        this.CAPACIDADE = capacidade;
    }
}
