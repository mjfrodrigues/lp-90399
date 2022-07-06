/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package engarrafadora;

/**
 *
 * @author mjfr
 */
public class TesteEngarrafadora {
    public static void main(String[] args) throws InterruptedException {
        //Por agora, ignorar o throws no método main. Está relacionado com a instrução Thread.sleep e refere-se a exceções. Em POO iremos abordar no 3º período
        Engarrafadora egrf = new Engarrafadora(1, (float)0.33, 7, 7);
        System.out.println(egrf.obtemGarrafasCapacidade());
        for(int i=0;i<3;i++){
            egrf.encheGarrafaAgua();
            egrf.encheGarrafaSumo();
            System.out.println(egrf.obtemGarrafasCapacidade());
            Thread.sleep(1000); //Aguarda 1 segundo
        }
        egrf.abastece(2, 2);
        for(int i=0;i<10;i++){
            egrf.encheGarrafaAgua();
            egrf.encheGarrafaSumo();
            System.out.println(egrf.obtemGarrafasCapacidade());
            Thread.sleep(1000); //Aguarda 1 segundo
        }
    }
}
