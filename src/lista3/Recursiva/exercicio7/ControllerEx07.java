package lista3.Recursiva.exercicio7;

public class ControllerEx07 {
	
	public ControllerEx07() {
		
		super();
		
	}
	

    public int somaDigitos(int n) {

        // Se vier negativo, transforma em positivo sem Math.abs
        if (n < 0) {
            n = -n;
        }

        // Condição de parada:
        // quando n tem apenas 1 dígito (0 a 9), a soma dos dígitos é o próprio n.
        if (n < 10) {
            return n;
        }

        int ultimo = n % 10;

        // Relação do termo n em função do termo anterior:
        // soma(n) = (n % 10) + soma(n / 10)
        // (pega o último dígito e soma com a soma dos dígitos do resto do número)
        return ultimo + somaDigitos(n / 10);
    }

}
