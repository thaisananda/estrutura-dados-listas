package lista1.pilhas.exercicio3a;

public class PilhaInt {
	
	No topo;
	
	public PilhaInt() {
		topo = null; 
	}
	
	public boolean isEmpty() {
	    
		return topo == null; 
	    
	}
	
	public void push(int e) {
		
		   No elemento = new No();
	       elemento.dado = e;
	       elemento.proximo = topo;
	       topo = elemento;
		
	}

	public int pop() throws Exception {
		
		if(isEmpty()) {
			throw new Exception("Não há elementos para desempilhar");
		}
		
		int valor = topo.dado;
		topo = topo.proximo;
		return valor;
	}
	
	 public int size() {
	        int contador = 0;
	        No auxiliar = topo;
	        
	        while (auxiliar != null) {
	            contador++;
	            auxiliar = auxiliar.proximo;
	        }
	        
	        return contador;
	    }
	
}
