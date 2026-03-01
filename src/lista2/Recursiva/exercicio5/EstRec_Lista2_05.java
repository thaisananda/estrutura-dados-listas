/*
 OBJETIVO: Construir uma função recursiva que receba 2 números inteiros positivos e apresente o MDC desses números.
 PROGRAMADORA: THAIS ANANDA
 DATA DE CRIAÇÃO: 01/03/2026
 */

package lista2.Recursiva.exercicio5;

import javax.swing.JOptionPane;

public class EstRec_Lista2_05 {

	public static void main(String[] args) {
		
		int n1, n2;
		
		// 🔹 repete até o usuário digitar valores válidos (positivos)
		do {
			
			n1 = Integer.parseInt(
					JOptionPane.showInputDialog("Digite o primeiro número inteiro POSITIVO:")
			);
			
			n2 = Integer.parseInt(
					JOptionPane.showInputDialog("Digite o segundo número inteiro POSITIVO:")
			);

			// validação
			if (n1 <= 0 || n2 <= 0) {
				JOptionPane.showMessageDialog(null, "Valor inválido! Os dois números devem ser positivos.");
			}

		} while (n1 <= 0 || n2 <= 0);

		// 🔹 chama a função recursiva
		ControllerEx05 c = new ControllerEx05();
		
		int resultado = c.mdcRecursiva(n1, n2);

		// 🔹 mostra o resultado
		System.out.println("O MDC de " + n1 + " e " + n2 + " é: " + resultado);
	}
}