package lista3.Recursiva.exercicio2;

public class ControllerEx02 {
	
	public ControllerEx02() {
		
		super();
		
	}

    public int contaOcorrencias(int numero, int digito) {

        // Condição de parada:
        // quando numero chega em 0, não há mais dígitos para analisar.
        if (numero == 0) {
            return 0;
        }

        int ultimo = numero % 10; // pega o último dígito

        // Relação do termo n com o termo anterior (passo recursivo):
        // f(numero) = f(numero/10) + (1 se ultimo == digito, senão 0)
        if (ultimo == digito) {
            return 1 + contaOcorrencias(numero / 10, digito);
        } else {
            return contaOcorrencias(numero / 10, digito);
        }
    }
}