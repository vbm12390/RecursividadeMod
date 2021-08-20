package controller;

public class ComparaNumero {

	public ComparaNumero() {
		super();
	}
	
	public int Comparador(int numero, int alvo) {
		//Condição de parada
		if (numero == 0) {
			return 0;
		}else {
			int cont = 0;
			int valor = numero / 10;
			if (numero % 10 == alvo) {
				cont = cont + 1 + Comparador(valor, alvo);
			}else {
				cont = cont + Comparador(valor, alvo);
			}
			return cont;
		}
	}

}
