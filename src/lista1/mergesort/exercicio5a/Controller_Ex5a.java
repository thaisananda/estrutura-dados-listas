package lista1.mergesort.exercicio5a;

import ordenacao.MergeSort;

public class Controller_Ex5a {
	
	public Controller_Ex5a() {
		
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
