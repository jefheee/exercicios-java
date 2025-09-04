/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Principal;
import javax.swing.JOptionPane;
/**
 *
 * @author jefhi
 * enunciado: Implemente um algoritmo em JAVA que escreva a seguinte mensagem na tela, substituindo a profissão pela informada pelo usuário:
 * "Tibúrcio é <profissão>" Solicite ao usuário que informe a profissão do Tibúrcio, apresente as seguintes opções:
 * e = engenheiro; 
 * p = programador;
 * m = médico;
 * a = advogado;
 * d = designer.
 */
public class Exercício17 {
    public static void main(String[] args) {
        String opcoes = "Informe a profissão de Tibúrcio, escolha uma das opções:\n\n"
                + "e - engenheiro\n"
                + "m - médico\n"
                + "d - designer\n"
                + "p - programador\n"
                + "a - advogado\n";
        
        String input = JOptionPane.showInputDialog(null, opcoes);
        String profissao;
        
        if(input == null || input.isEmpty()) { //Verifica se o usuário cancelou ou deixou o campo em branco
            profissao = "desempregado";
        }else {
            char opcao = input.charAt(0);//// Se o usuário digitou algo, pegamos a primeira letra
            
            switch(opcao) {
             case 'e':
                    profissao = "engenheiro";
                    break;
                case 'm':
                    profissao = "médico";
                    break;
                case 'd':
                    profissao = "designer";
                    break;
                case 'p':
                    profissao = "programador";
                    break;
                case 'a':
                    profissao = "advogado";
                    break;
                default:
                    // Se a letra não for nenhuma das opções acima
                    profissao = "DESEMPREGADO";
                    break;
            
            }        
                JOptionPane.showMessageDialog(null, "Tibúrcio é " +profissao);
            
        }
    }
}
