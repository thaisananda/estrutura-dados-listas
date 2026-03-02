package lista3.Recursiva.exercicio1;

public class ControllerEx01 {
	
	public ControllerEx01() {
		
		super();
		
	}
	
	public int quant_digitos(int n) {
		
	     // Condição de parada:
        // Se n está entre -9 e 9, então ele tem apenas 1 dígito (ignorando o sinal).
        // Exemplos: 7 -> 1 dígito, 0 -> 1 dígito, -3 -> 1 dígito.
        if (n >= -9 && n <= 9) {
            return 1;
        }
		
        // Como escrever a função para o termo n em função do termo anterior:
        // f(n) = 1 + f(n/10)
        //
        // Explicação:
        // Dividir por 10 "remove" o último dígito do número.
        // Ex: 1234/10 = 123 (remove o 4)
        // Ex: -1234/10 = -123 (remove o 4, o sinal fica)
        //
        // Cada divisão remove 1 dígito, então somamos 1 e chamamos a função para o número menor.
        return 1 + quant_digitos(n / 10);
    }
}
		
