/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Principal;

import javax.swing.JOptionPane;

/**
 *
 * @author jefhi
 */
public class Exercício8 {
    public static void main(String[] args) {
        
        String texto1 = JOptionPane.showInputDialog("Digite o primeiro número: ");
        int numero1 = Integer.parseInt(texto1);
        
        String texto2 = JOptionPane.showInputDialog("Digite o segundo número: ");
        int numero2 = Integer.parseInt(texto2);
        
        int soma = numero1 + numero2;
        
        JOptionPane.showMessageDialog(null, "A soma dos dois números é: " + soma);
    }
}
