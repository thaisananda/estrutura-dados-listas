package lista2.pilhas.exercicio3.controller;

import br.edu.fateczl.pilhaint.Pilha;

public class FatController {
	
	public FatController() {
		
		super();
		
	}
	
	public int fatorial(int numero) {
		
		Pilha p = new Pilha();
		int fat = 1;
		
		
	
		while(numero>=0) {
			if(numero != 0) {
				p.push(numero);
				numero --;
				
			} else {
				p.push(1);
				numero --;
			}
		}
		
		int tamanho = p.size();
		
		for(int j = 0; j < tamanho; j++) {
			
			try {
				fat = fat * p.pop();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		return fat;
	}

}
