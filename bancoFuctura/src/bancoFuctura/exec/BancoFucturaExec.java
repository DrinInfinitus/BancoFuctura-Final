package bancoFuctura.exec;

import bancoFuctura.contas.ContaCorrente;
import bancoFuctura.contas.ContaPoupanca;
import bancoFuctura.contas.Executaveis;

import java.util.Random;
import java.util.Scanner;

public class BancoFucturaExec {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		ContaCorrente contaC = new ContaCorrente();
		ContaPoupanca contaP = new ContaPoupanca();
		Executaveis veri = new Executaveis();
		Random gerador = new Random();
		
		System.out.println("Deseja realizar um cadastro?"
				+ "\n 1 - Sim"
				+ "\n 2 - Não");
		byte E = input.nextByte();
		if (E == 1) {
			System.out.println("Qual seu nome?");
			String nome = input.next();
			contaC.setnomT(nome);
			contaC.setnumC(gerador.nextInt(999));
			
			System.out.println("Deseja realizar um depósito inicial?"
					+ "\n 1 - Sim"
					+ "\n 2 - Não");
			int sel = input.nextInt(3);
			contaC.setver(E);
			contaP.setver(E);
			if (sel == 1) {
				System.out.println("Quanto deseja depositar?");
				float dep = input.nextFloat();
				contaC.setSalD(dep);
			} 
		} else {
			veri.verificar();
		}
		
		if (contaC.getver() == 0) {
			byte conta = 2;
			contaC.setver(conta);
			contaP.setver(conta);
		}
		
		if (contaC.getver() == 1) {
			System.out.println("Boas-vindas "+contaC.getnomT());
			
			} else if (contaC.getver() == 2) {
				System.out.println("Boas-vindas "+contaC.getnomTR());
				
			}
		
		byte cont = 0;
		if (0 < contaC.getver()) {
		do {
			System.out.println("Por favor, digite uma operação:"
					+ "\n1 - Consultar saldo"
					+ "\n2 - Fazer depósito"
					+ "\n3 - Fazer saque"
					+ "\n4 - Transferir para poupança"
					+ "\n5 - Resgatar da poupança"
					+ "\n6 - Finalizar.");
			
			byte o = input.nextByte(7);
			switch (o) {
			case 1:
				if (contaC.getver() == 1) {
					int dado1 = contaC.getnumC();
					String dado2 = contaC.getnomT();
					float dado3 = contaC.getSalD();
					float dado4 = contaP.getSalD();
					contaC.dados (dado1, dado2);
					contaC.saldo (dado3, dado4);
				} else if (contaC.getver() == 2) {
					int dado1 = contaC.getnumCR();
					String dado2 = contaC.getnomTR();
					float dado3 = contaC.getSalDR();
					float dado4 = contaP.getSalDR();
					contaC.dados (dado1, dado2);
					contaC.saldo (dado3, dado4);
				}
				break;
			case 2:
					System.out.println("Quanto deseja depositar?");
					float e = input.nextFloat();
					contaC.dep(e);

				break;
			case 3:
				System.out.println("Quanto deseja sacar?");
				float s = input.nextFloat();
				contaC.saque(s);
				
				break;
			case 4:
				System.out.println("Quanto deseja transferir da sua conta para a poupança?");
				float t = input.nextFloat();
				contaC.aplicar(t);
				if (contaC.getv() ==1) {
				contaP.aplicarP(t);
				byte d = 0;
				contaC.setv(d);
				} else {
					System.out.println("Você não possui esse saldo na sua conta corrente.");
				}
				
				break;
			case 5:
				System.out.println("Quanto deseja retirar da poupança?");
				float r = input.nextFloat();
				contaP.resgate(r);
				if (contaP.getv() == 1 ) {
				contaC.resgate(r);
				byte d = 0;
				contaP.setv(d);
				} else {
					System.out.println("Você não possui esse saldo na sua conta corrente.");
				}
				
				break;
			case 6:
				System.out.println("Obrigado por usar nossos serviços.");
				cont = 1;
				break;
				default:
					System.out.println("Você escolheu uma opção inválida, tente novamente.");
					break;
			}
			
		}while (cont<1);
		
	}
		
	}

}

