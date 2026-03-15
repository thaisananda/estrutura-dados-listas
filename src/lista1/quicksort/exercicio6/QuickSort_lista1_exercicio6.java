/*
 OBJETIVO: Criar um projeto Java que receba as bibliotecas BubbleSort, MergeSort e QuickSort. 
 O projeto deve prever um vetor com 1500 posições ({1499, 1498, 1497, ..., 0}) e apresentar o tempo de ordenação para cada um dos métodos.
 PROGRAMADOR: THAIS ANANDA
 DATA DE CRIAÇÃO: 15/03/2026
 */

package lista1.quicksort.exercicio6;

import java.util.Arrays;
import ordenacao.BubbleSort;
import ordenacao.MergeSort;
import ordenacao.QuickSort;

public class QuickSort_lista1_exercicio6 {
	

	public static void main(String[] args) {
			
			int[] vetorOriginal = new int[1500];
			
			for (int i = 0; i < vetorOriginal.length; i++) {
				vetorOriginal[i] = 1499 - i;
			}
			
			int[] vetorBubble = Arrays.copyOf(vetorOriginal, vetorOriginal.length);
			int[] vetorMerge = Arrays.copyOf(vetorOriginal, vetorOriginal.length);
			int[] vetorQuick = Arrays.copyOf(vetorOriginal, vetorOriginal.length);
			
			BubbleSort bubble = new BubbleSort();
			MergeSort merge = new MergeSort();
			QuickSort quick = new QuickSort();
			
			long inicioBubble = System.nanoTime();
			bubble.bubbleSort(vetorBubble);
			long fimBubble = System.nanoTime();
			
			long inicioMerge = System.nanoTime();
			merge.mergeSort(vetorMerge, 0, vetorMerge.length - 1);
			long fimMerge = System.nanoTime();
			
			long inicioQuick = System.nanoTime();
			quick.quickSort(vetorQuick, 0, vetorQuick.length - 1);
			long fimQuick = System.nanoTime();
			
			System.out.println("Tempo BubbleSort: " + (fimBubble - inicioBubble) + " ns");
			System.out.println("Tempo MergeSort: " + (fimMerge - inicioMerge) + " ns");
			System.out.println("Tempo QuickSort: " + (fimQuick - inicioQuick) + " ns");
		}
}
