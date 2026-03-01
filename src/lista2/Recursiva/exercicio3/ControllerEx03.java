package lista2.Recursiva.exercicio3;

public class ControllerEx03 {
	
	 public ControllerEx03() {
	        super();
	    }

	    public int contaPares(int[] vet, int tamanho) {

	        // caso base
	        if (tamanho == 0) {
	            return 0;
	        }

	        // verifica o último elemento
	        if (vet[tamanho - 1] % 2 == 0) {
	            return 1 + contaPares(vet, tamanho - 1);
	            
	        } else {
	            return contaPares(vet, tamanho - 1);
	        }
	    }
	
}
