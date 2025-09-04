/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Principal;
import javax.swing.JOptionPane;
/**
 *
 * @author jefhi
 * enunciado: Solicitar o ano de nascimento de uma pessoa e o ano atual. 
 * Verifique se o ano de nascimento é válido, ou seja, se o ano de nascimento é menor que o ano atual, 
 * então mostre a idade desta pessoa.
 */
public class Exercício14 {
    public static void main(String[] args) {
        int anoNascimento = Integer.parseInt(JOptionPane.showInputDialog("Digite seu ano de nascimento: "));
        int anoAtual = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano atual: "));
        
        if(anoNascimento < anoAtual) {
            int idade = anoAtual - anoNascimento;
            JOptionPane.showMessageDialog(null, "Você tem " + idade + " anos.");
        }else {
            JOptionPane.showMessageDialog(null, "Ano de nascimento inválido! Deve ser menor que o ano atual.");
        }
    }
}
