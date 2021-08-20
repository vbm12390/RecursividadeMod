package view;

import javax.swing.JOptionPane;

import controller.ComparaNumero;

public class Principal {

	public static void main(String[] args) {
		ComparaNumero cNum = new ComparaNumero();
		int numero = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite um numero entre 10 e 999999: "));
		int alvo = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite um numero entre 0 e 9"));
		int comparado = 0;
		
		if (numero >= 10 && numero <= 999999) {
			if (alvo >= 0 && alvo <= 9) {
				comparado = cNum.Comparador(numero, alvo);
			}else {
				System.err.println("Numero de comparação fora dos parâmetros estipulados");
				System.exit(0);
			}
			}else {
				System.err.println("Numero a ser verificado fora dos parâmetros estipulados");
				System.exit(0);
			}
		System.out.println(comparado);
	}

}
