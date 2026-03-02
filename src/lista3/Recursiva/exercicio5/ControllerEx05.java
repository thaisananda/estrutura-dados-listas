package lista3.Recursiva.exercicio5;

public class ControllerEx05 {
	
	public ControllerEx05() {
		
		super();
		
	}

    public int fib(int n) {

        // Condição de parada:
        // se n == 1 ou n == 2, o valor é 1.
        if (n == 1 || n == 2) {
            return 1;
        }

        // Relação do termo n em função dos termos anteriores:
        // Fib(n) = Fib(n-1) + Fib(n-2)  (para n > 2)
        return fib(n - 1) + fib(n - 2);
    }
}