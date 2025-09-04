/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Principal;
import javax.swing.JOptionPane;
/**
 *
 * @author jefhi
 * enunciado:
 * Faça um programa em JAVA que solicite 2 números inteiros, 
 * verificar qual é o número maior e mostrar na tela,
 * ou se forem iguais, mostrar uma mensagem indicando esta informação.
 */
public class Exercício12 {
    public static void main(String[] args) {
        int numero1,numero2;
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um números inteiro"));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro números inteiro"));
        if(numero1 > numero2){
            JOptionPane.showMessageDialog(null, "O maior número é " +numero1);
        }else if(numero2 > numero1){//else if executa se a numero1 for falsa e numero2 for verdadeira
            JOptionPane.showMessageDialog(null, "O maior númeor é " +numero2);
        }else {
            JOptionPane.showMessageDialog(null, "Os dois números são iguais");
        }
    }
}
