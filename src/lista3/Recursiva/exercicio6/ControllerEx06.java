package lista3.Recursiva.exercicio6;

public class ControllerEx06 {
	
	public ControllerEx06() {
		
		super();
		
	}

    public double somaSerie(int n) {

        // Condição de parada:
        // Para n == 1, a série tem somente o primeiro termo: S = 1
        if (n == 1) {
            return 1.0;
        }

        // Relação do termo n em função do termo anterior:
        // S(n) = S(n-1) + 1/n!
        return somaSerie(n - 1) + (1.0 / fatorial(n));
    }

    // Função auxiliar (pode ser recursiva também)
    private double fatorial(int n) {
        if (n == 0 || n == 1) {
            return 1.0;
        }
        return n * fatorial(n - 1);
    }
}