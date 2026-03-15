package lista1.bubblesort.exercicio5c;

import ordenacao.BubbleSort;

public class Controller_Ex5c {
	
	public Controller_Ex5c() {
		
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
