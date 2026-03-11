package lista1.ordenacao.quicksort;

public class QuickSort_Lista1_01 {

	public static void main(String[] args) {
		
		int[] vetor = {74, 20, 74, 87, 81, 16, 25, 99, 44, 58};
		
		Controller_Ex01 controller = new Controller_Ex01();
		
		controller.executarQuickSort(vetor);
	}
}