/*
 OBJETIVO: Criar uma aplicação em Java que tenha uma função recursiva que, recebendo um número inteiro (N), apresente a saída da somatória 𝑆𝑆=1+ 12!+ 13!+ 14!+ …+ 1𝑁𝑁!
 PROGRAMADOR: THAIS ANANDA
 DATA DE CRIAÇÃO: 01/03/2026
 */

package lista3.Recursiva.exercicio6;

import javax.swing.JOptionPane;

public class EstRec_Lista3_06 {
	
	 public static void main(String[] args) {

	        int n;

	        // Validação na main (não foi dado limite no enunciado,
	        // então vou garantir pelo menos n >= 1; se quiser, pode limitar até 20)
	        do {
	            n = Integer.parseInt(JOptionPane.showInputDialog("Digite N (N >= 1):"));
	        } while (n < 1);

	        ControllerEx06 c = new ControllerEx06();
	        double s = c.somaSerie(n);

	        JOptionPane.showMessageDialog(null, "S = " + s);
	  }

}
