package bancoFuctura.contas;

import java.util.Scanner;

public class Executaveis extends ContaCorrente{
	
	Scanner input = new Scanner(System.in);
	
	public String verificar () {
		System.out.println("Qual os carácteres da sua conta?");
		String carac = input.next().toUpperCase();
		if (carac .equals(getnomTR())) {
			System.out.println("Qual o número da sua conta?");
			int num = input.nextInt();
			if (num == getnumCR()) {
				System.out.println("Qual a senha da sua conta?");
				int senha = input.nextInt();
				if (getsenha() == senha) {
					System.out.println("Seu acesso foi autorizado.");
				} else {
					System.out.println("Seu acesso foi bloqueado");
				}
			} else {
				System.out.println("Seu acesso foi bloqueado");
			}
		} else {
			System.out.println("Seu acesso foi bloqueado");
		}
		return null;
	}

}
