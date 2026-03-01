package lista2.Recursiva;

public class ControllerEx05 {
	
	public ControllerEx05() {
		super();
	}
	
	public int mdcRecursiva(int x, int y) {
		
		// 🔹 CASO BASE:
		// Quando os dois números ficam iguais, encontramos o MDC.
		// Ex: MDC(4,4) = 4
		if (x == y) {
		    return x;
		}

		// 🔹 PASSO RECURSIVO:
		// Se x é maior que y, subtraímos o menor (y) do maior (x).
		// Isso reduz o problema, mas mantém o mesmo MDC.
		// Ex: MDC(20,24) → MDC(24,20) → MDC(4,20)
		if (x > y) {
		    return mdcRecursiva(x - y, y);
		} 
		
		// 🔹 CASO CONTRÁRIO (y > x):
		// Apenas invertemos a ordem para garantir que o maior fique primeiro.
		// Isso facilita continuar a subtração corretamente.
		else {
		    return mdcRecursiva(y, x);
		}
	}
}