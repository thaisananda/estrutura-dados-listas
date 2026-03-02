package lista3.Recursiva.exercicio4;

public class ControllerEx04 {
	
	public ControllerEx04() {
		
		super();
		
	}

    public String paraBinario(int n) {

        // Condição de parada:
        // quando n é 0 ou 1, o binário é o próprio n ("0" ou "1").
        if (n < 2) {
            return String.valueOf(n);
        }

        // Relação do termo n em função do termo anterior:
        // bin(n) = bin(n/2) + (n%2)
        //
        // Explicação:
        // - n/2 reduz o problema (remove o "último bit" que ainda será descoberto)
        // - n%2 dá o bit atual (0 ou 1), que entra no FINAL da resposta
        return paraBinario(n / 2) + String.valueOf(n % 2);
    }
}