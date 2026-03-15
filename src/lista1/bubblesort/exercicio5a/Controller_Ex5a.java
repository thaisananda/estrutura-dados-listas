package lista1.bubblesort.exercicio5a;

import ordenacao.BubbleSort;

public class Controller_Ex5a {
	
	public Controller_Ex5a() {
		
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
