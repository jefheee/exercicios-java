/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Principal;
import javax.swing.JOptionPane;
/**
 *
 * @author jefhi
 * enunciado: Solicitar nome e idade de uma pessoa. Se a pessoa possuir idade entre 15 e 25 anos,
 * imprimir o nome e a mensagem: “ACEITA”. Caso contrário, imprimir o nome e a mensagem: “NÃO ACEITA”.
 */
public class Exercício15 {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Insira seu nome: ");
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Insira sua idade: "));
        
        if(idade >=15 && idade <25) {
            JOptionPane.showMessageDialog(null, nome + " ACEITA");
        }else {
            JOptionPane.showMessageDialog(null, nome + " NÃO ACEITA");
        }
    }
}
