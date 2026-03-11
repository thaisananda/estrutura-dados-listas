package lista1.quicksort.exercicio5c;

import ordenacao.QuickSort;

public class Controller_Ex05c {
	
	public Controller_Ex05c() {
		super();
	}
	
	public void executarQuickSort(int[] vetor) {
		
		QuickSort quick = new QuickSort();
		vetor = quick.quickSort(vetor, 0, vetor.length - 1);
		
		System.out.println("Vetor ordenado:");
		for (int valor : vetor) {
			System.out.print(valor + " ");
		}
	}

}
