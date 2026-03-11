package lista1.ordenacao.quicksort;

import ordenacao.QuickSort;

public class Controller_Ex01 {
	
	public Controller_Ex01() {
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