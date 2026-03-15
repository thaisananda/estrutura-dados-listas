package lista1.bubblesort.exercicio5b;

import ordenacao.BubbleSort;

public class Controller_Ex5b {
	
	public Controller_Ex5b() {
		
		super();
		
	}

	public void executarBubbleSort(int[] vetor) {
		
		BubbleSort ordenacao = new BubbleSort();
		
		vetor = ordenacao.bubbleSort(vetor);
		
		System.out.println("Vetor ordenado:");
		for (int valor : vetor) {
			System.out.print(valor + " ");
		}
	}
}
