/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package depositos;

/**
 *
 * @author mjfr
 */
public class TesteDeposito {
    public static void main(String[] args) throws InterruptedException {
        //Por agora, ignorar o throws no método main. Está relacionado com a instrução Thread.sleep e refere-se a exceções. Em POO iremos abordar no 3º período
        Deposito dep = new Deposito(20, 50, 50);
        System.out.println(dep.obtemRelatorio());
        for(int i=0;i<3;i++){
            dep.abreUmSegundo();
            System.out.println(dep.obtemRelatorio());
        }
        System.out.println("A abastecer 50 litros (principal) e 20 litros (reserva)");
        dep.abastece(50, 20);
        for(int i=0;i<6;i++){
            dep.abreUmSegundo();
            System.out.println(dep.obtemRelatorio());
        }
    }
}
