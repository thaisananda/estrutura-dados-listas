/*
 OBJETIVO: Construir uma aplicação em Java que tenha uma função recursiva que, recebendo um número inteiro, converta para binário.
 PROGRAMADOR: THAIS ANANDA
 DATA DE CRIAÇÃO: 01/03/2026
 */

package lista3.Recursiva.exercicio4;

import javax.swing.JOptionPane;

public class EstRec_Lista3_04 {
	
	 public static void main(String[] args) {

	        int n;

	        // Validação na main (como o enunciado pede):
	        // limitar a entrada a 2000 (vou aceitar de 0 a 2000)
	        do {
	            n = Integer.parseInt(JOptionPane.showInputDialog("Digite um inteiro de 0 a 2000:"));
	        } while (n < 0 || n > 2000);

	        ControllerEx04 c = new ControllerEx04();
	        String bin = c.paraBinario(n);

	        JOptionPane.showMessageDialog(null, n + " em binário = " + bin);
	    }

}
