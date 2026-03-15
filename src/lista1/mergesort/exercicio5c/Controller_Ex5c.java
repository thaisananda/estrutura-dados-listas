package lista1.mergesort.exercicio5c;

import ordenacao.MergeSort;

public class Controller_Ex5c {
	
	public Controller_Ex5c() {
		
		super();
		
	}
	
	public void executarMergeSort(int[] vetor) {
		
		MergeSort ordenacao = new MergeSort();
		
		vetor = ordenacao.mergeSort(vetor, 0, vetor.length - 1);
		
		System.out.println("Vetor ordenado:");
		for (int valor : vetor) {
			System.out.print(valor + " ");
		}
	}

}
