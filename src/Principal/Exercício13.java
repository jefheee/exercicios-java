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
 * A prefeitura de Florianópolis abriu uma linha de crédito para os funcionários estatutários.
 * O valor máximo da prestação não poderá ultrapassar 30% do salário bruto.
 * Faça um algoritmo que permita entrar com o salário bruto e o valor da prestação 
 * e informar se o empréstimo pode ou não ser concedido.
 */
public class Exercício13 {
    public static void main(String[] args) {
        //entrada de dados
        double salario = Double.parseDouble(JOptionPane.showInputDialog("Digite seu salário bruto: "));
        double prestação = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da prestação: "));
        
        //regra: prestação não pode ser maior que 30% do salário
        double limite = salario * 0.3; 
        
        if(prestação <= limite) {
            JOptionPane.showMessageDialog(null, "Empréstimo CONCEDIDO");
        }else {
            JOptionPane.showMessageDialog(null, "Empréstimo NEGADO! A prestação ultrapassou o limite");
        }
    }
}
