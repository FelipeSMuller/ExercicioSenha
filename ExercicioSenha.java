package senaiprojetos;

import javax.swing.JOptionPane;

public class ExercicioSenha {

	public static void main(String[] args) {
		/*
		 * Crie uma classe que gera um número aleatoriamente (entre 5 e 10) por
		 * Math.random. Em seguida, faça com que apareça em tela uma senha numérica
		 * contendo a mesma quantidade de dígitos correspondentes ao valor aleatório
		 * gerado. Apresente em tela o número sorteado e a senha
		 */

		int numeroAleatorio, senha = 0;

		numeroAleatorio = (int) (Math.random() * 6 + 5);

		for (int i = 0; i < numeroAleatorio; i++) {
			int digito = (int) (Math.random() * 9);

			senha = senha * 10 + digito;
			System.out.println(senha);

		}

		JOptionPane.showMessageDialog(null, " Número Aleatório : " + numeroAleatorio + "\n  Senha : " + senha);

	}

}