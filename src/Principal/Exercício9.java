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
public class Exercício9 {
    public static void main(String[] args) {
        //pede a altura, uso o "trim() pra fazer limpar espaços do q o usuário digita
        String textoAltura = JOptionPane.showInputDialog("Digite sua altura em metros, (use ponto): ");
        double Altura = Double.parseDouble(textoAltura.trim());
        
        //pede o peso uso o "trim() pra fazer limpar espaços do q o usuário digita
        String textoPeso = JOptionPane.showInputDialog("Digite seu peso (kg): ");
        int peso = Integer.parseInt(textoPeso.trim());
        
        //calcula o imc
        double imc = peso / (Altura*Altura);
        
        /*
        mostro o resultado do IMC e com a formatação
        %=indica que vem um valor pra substituir
        f-valor do tipo float/double
        .2=número de casas decimais (2 neste caso), se for 0, vai resultar o número inteiro
        */
        JOptionPane.showMessageDialog(null,"Seu IMC é: " + String.format("%.2f.", imc));
        
        
    }
    
}
