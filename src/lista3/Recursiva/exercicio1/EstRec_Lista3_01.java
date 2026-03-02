package lista3.Recursiva.exercicio1;

import javax.swing.JOptionPane;

public class EstRec_Lista3_01 {
	
	public static void main(String[] args) {
		
		
		int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro:"));
		
        ControllerEx01 quantidade_digitos = new ControllerEx01();
        
        int qtd = quantidade_digitos.quant_digitos(n1);
        
        System.out.println("A quantidade de dígitos é: " + qtd);
        
	}

}
