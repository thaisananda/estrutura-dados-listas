package lista2.Recursiva;

public class ControllerEx06 {

	public ControllerEx06() {
		super();
	}

	public void inverterVetor(int[] vet, int ini, int fim) {

		// CASO BASE → quando os índices se encontram ou cruzam
		if (ini >= fim) {
			return;
		}

		// troca os valores das posições ini e fim
		int temp = vet[ini];
		vet[ini] = vet[fim];
		vet[fim] = temp;

		// chamada recursiva para o "miolo" do vetor
		inverterVetor(vet, ini + 1, fim - 1);
	}
}