package lista2.Recursiva.exercicio6;

import javax.swing.JOptionPane;

public class EstRec_Lista2_06 {

	public static void main(String[] args) {

		int tamanho;

		// valida o tamanho (tem que ser positivo)
		do {
			tamanho = Integer.parseInt(
					JOptionPane.showInputDialog("Digite o tamanho do vetor:")
			);

			if (tamanho <= 0) {
				JOptionPane.showMessageDialog(null, "Tamanho inválido! Digite um número positivo.");
			}

		} while (tamanho <= 0);

		int[] vetor = new int[tamanho];

		// preenchendo o vetor
		for (int i = 0; i < tamanho; i++) {
			vetor[i] = Integer.parseInt(
					JOptionPane.showInputDialog("Digite o valor da posição " + i + ":")
			);
		}

		// mostrando o vetor original
		System.out.println("Vetor original:");
		for (int n : vetor) {
			System.out.print(n + " ");
		}

		// chamando a função recursiva
		ControllerEx06 c = new ControllerEx06();
		c.inverterVetor(vetor, 0, vetor.length - 1);

		// mostrando o vetor invertido
		System.out.println("\nVetor invertido:");
		for (int n : vetor) {
			System.out.print(n + " ");
		}
	}
}