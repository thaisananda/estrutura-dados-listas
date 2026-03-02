/*
 OBJETIVO: Construir uma função recursiva que, dado uma posição da série de Fibonacci, a função retorne seu valor.
 PROGRAMADOR: THAIS ANANDA
 DATA DE CRIAÇÃO: 01/03/2026
 */

package lista3.Recursiva.exercicio5;

import javax.swing.JOptionPane;

public class EstRec_Lista3_05 {
	
	public static void main(String[] args) {

        int n;

        // Validação na main (1 a 20)
        do {
           
        	n = Integer.parseInt(JOptionPane.showInputDialog("Digite a posição n da série (1 a 20):"));
           
        } while (n < 1 || n > 20);

        ControllerEx05 c = new ControllerEx05();
        int valor = c.fib(n);

        JOptionPane.showMessageDialog(null, "Fib(" + n + ") = " + valor);
    }

}
