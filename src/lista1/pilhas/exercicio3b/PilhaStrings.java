package lista1.pilhas.exercicio3b;

import lista1.pilhas.exercicio3b.No;

public class PilhaStrings {
	
private No topo;
    
    public PilhaStrings() {
        topo = null;
    }
    
    public boolean isEmpty() {
        return topo == null;
    }
    
    public void push(String e) {
        No elemento = new No();
        elemento.dado = e;
        elemento.proximo = topo;
        topo = elemento;
    }
    
    public String pop() throws Exception {
        if (isEmpty()) {
            throw new Exception("Não há elementos para desempilhar");
        }
        
        String valor = topo.dado;
        topo = topo.proximo;
        return valor;
    }
    
    public String peek() throws Exception {
        if (isEmpty()) {
            throw new Exception("Não há elementos na pilha");
        }
        
        return topo.dado;
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
