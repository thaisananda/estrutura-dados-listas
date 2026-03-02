/*
 OBJETIVO: Construa uma função recursiva que calcule a soma dos dígitos de um número inteiro. Por exemplo, se a entrada for 123, portanto 1+2+3, logo, a saída deverá ser 6.
 PROGRAMADOR: THAIS ANANDA
 DATA DE CRIAÇÃO: 01/03/2026
 */

package lista3.Recursiva.exercicio7;

import javax.swing.JOptionPane;

public class EstRec_Lista3_07 {
	
	 public static void main(String[] args) {

	        int n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro:"));

	        ControllerEx07 c = new ControllerEx07();
	        int soma = c.somaDigitos(n);

	        JOptionPane.showMessageDialog(null, "Soma dos dígitos = " + soma);
	    }
}
