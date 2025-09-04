/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Principal;
import javax.swing.JOptionPane;
/**
 *
 * @author jefhi
 * enunciado: Implemente uma calculadora, primeiro peça 2 números ao usuário 
 * (um de cada vez) e apresente as seguintes opções: adição, subtração, multiplicação e divisão.
 * mostre o resultado após a operação.
 */
public class Exercício16 {
    public static void main(String[] args) {
        //entrada de dados
        double num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite seu primeiro número"));
        double num2 = Double.parseDouble(JOptionPane.showInputDialog("Digite seu segundo número"));
        
        //menu de opções
        String opcao;
        opcao = JOptionPane.showInputDialog(
                "Escolha a operação: \n" +
                        "1 - Adição (+)\n" +
                        "2 - Subtração (-)\n" +
                        "3 - Multiplicação (*)\n" +
                        "4 - Divisão (/)"
                        );
        
        double resultado = 0;
        boolean valido = true;
                
        //estrutura de decisão
        switch(opcao) {
            case "1":
                resultado = num1 + num2;
                break;
            case "2":
                resultado = num1 - num2;
                break;
            case "3":
                resultado = num1 * num2;
                break;
            case "4":
              if(num2 !=0) {  
                resultado = num1 / num2;
            }else {
                  JOptionPane.showMessageDialog(null, "Erro: divisão por zero não é permitida!");
                  valido = false;
              }    
                break;
        }
        //exibe o resultado somente se válido
        if (valido) {
            JOptionPane.showMessageDialog(null, "O resultado é: " +resultado);
        }
    }
}
