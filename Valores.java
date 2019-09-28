
public class Valores implements ValoresITF {

	int valores[] = new int[10];

	public Valores() {

	}

	@Override
	public boolean ins(int v) {
		boolean var = false;
		for (int i = 0; i < valores.length; i++) {
			if (this.valores[i] == 0) {
				if (var == false)
					valores[i] = v;
				var = true;
			}
		}
		return false;
	}

	@Override
	public int del(int num) {
		int k = 0;
		for (int i = 0; i < valores.length; i++) {
			if (valores[i] != k) {
				k++;
			}
		}
		int[] vetorAux = new int[k];
		int index = 0;
		for (int i = 0; i < valores.length; i++) {
			if (valores[i] != k) {
				vetorAux[index] = v[i];
				index++;
			}
		}
		valores = vetorAux;
		return 0;
	}

	@Override
	public int size() {
		int tam;
		tam = valores.length;
		return tam;
	}

	@Override
	public double mean() {
		double media = 0;
		for (int i = 0; i < valores.length; i++) {
			media = media + valores[i];
		}
		return media;
	}

	@Override
	public int greater() {
		int maior = 0;
		for (int i = 0; i < valores.length; i++) {
			if (valores[i] > maior) {
				maior = valores[i];
			}
		}
		return maior;
	}

	@Override
	public int lower() {
		int menor = 0;
		for (int i = 0; i < valores.length; i++) {
			menor = valores[i];
			if (valores[i] < menor) {
				menor = valores[i];
			}
		}
		return menor;
	}

}