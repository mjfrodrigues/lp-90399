/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author helder
 */
public class TesteRelogio {
    
    
    public static void main(String[] args) throws InterruptedException {
        //Por agora, ignorar o throws no método main. Está relacionado com a instrução Thread.sleep e refere-se a exceções, que iremos abordar no 3º período
        RelogioDigital rd = new RelogioDigital();
        System.out.println(rd.obtemHoraMinuto());
        for(int i=0;i<70;i++){
            rd.ticTac();
            System.out.println(rd.obtemHoraMinuto());
            Thread.sleep(1000); //Aguarda 1 segundo
        }
        rd.acertaRelogio(23, 55);
        System.out.println(rd.obtemHoraMinuto());
        for(int i=0;i<10;i++){
            rd.ticTac();
            System.out.println(rd.obtemHoraMinuto());
        }
    }
}
