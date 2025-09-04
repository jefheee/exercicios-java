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
 * Faça um programa em JAVA que solicite 2 números inteiros e efetue a adição;
 * caso o resultado seja maior que 10, apresentá-lo:
 */

/*
exemplo 1
Solicite um número ao usuário, se o número for maior que 10, mostre a sua metade.
public class Exercício10 {
    public static void main(String[] args) {
        double numero,metade;
        numero = Double.parseDouble(JOptionPane.showInputDialog("Insira um número: "));

        if(numero>10){
        metade=numero/2;
        JOptionPane.showMessageDialog(null,"A metade é: " + metade);
        }
    }

exemplo 3
Solicite um número ao usuário, se o número for maior que 10, mostre a sua metade. Se não for maior que 10 mostre seu dobro.
public class Exercício10 {
    public static void main(String[] args) {
        double numero,metade,dobro;
        numero = Double.parseDouble(JOptionPane.showInputDialog("Insira um número: "));
 
        if(numero>10){
        metade=numero/2;
        JOptionPane.showMessageDialog(null,"A metade é: " + String.format("%.0f",metade));
        }else{
            dobro = numero*2;
            JOptionPane.showMessageDialog(null,"O dobro é: " + String.format("%.0f",dobro));
        
        }
    }
    
}

exemplo 4
Solicitar um número ao usuário e verificar se o mesmo é divisível por 10, por 5, por 2 ou não é divisível por nenhum destes. Caso encontre ao menos um que é divisível, encerre a aplicação.
public class Exercício10 {
    public static void main(String[] args) {
        int numero;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Insira um número: "));
 
        if((numero%10)==0){
            JOptionPane.showMessageDialog(null, "É multiplo de 10!");
            }else{
                if((numero%2)==0){
                    JOptionPane.showMessageDialog(null, "É múltiplo de 2!");
                }else{
                    if((numero%5)==0){
                        JOptionPane.showMessageDialog(null, "É múltiplo de 5!");
                    }else{
                    JOptionPane.showMessageDialog(null, "Não é múltiplos destes!");
                    }
                }
        }
    }
}
*/
public class Exercício10 {
    public static void main(String[] args) {
        int numero1,numero2;
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Insira um número: "));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Insira outro número: "));
        
        int resultado = numero1+numero2;
        
        if (resultado>10){
        JOptionPane.showMessageDialog(null, "O resultado da soma é: " + resultado);
 
        }
    }
}