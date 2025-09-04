/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Principal;

import javax.swing.JOptionPane;

/**
 *
 * @author jefhi
 */
public class Exercício4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 1- criando a variável e chamando de João
        String nome = "João";
                
        // 2 - mostra o valor da variável q eu coloquei
        JOptionPane.showMessageDialog(null, nome);
        
        // 3 - mudando o valor da variável pra qlqr um
        nome = "Carlos";
        
        // 4 - mostrando o valor da variável e concatenando
        JOptionPane.showMessageDialog(null,"O valor da variável é: " + nome);
    }
    
}
