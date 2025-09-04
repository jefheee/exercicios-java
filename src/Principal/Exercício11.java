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
 * Faça um programa em JAVA que solicite 1 número inteiro, verificar 
 * se o mesmo é múltiplo de 2 e mostrar a resposta mesmo que negativa:
 */
public class Exercício11 {
    public static void main(String[] args) {
        int numero;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Insira um número inteiro: "));
        if(numero%2 == 0) {
            JOptionPane.showMessageDialog(null, "O número " +numero+ " é múltiplo de 2.");
        }else {
            JOptionPane.showMessageDialog(null, "O número " +numero+ " NÃO é múltiplo de 2.");
        }
    }
}
