package bancoFuctura.contas;

public class ContaCorrente extends Contas {
	
	private byte v = 0;
	
	public String saque(float saque) {
		if (getver() ==1) {
		if (saque <=getSalD()) {
			setSalD(getSalD() - saque);
		} else {
			System.out.println("Você não possui esse saldo na sua conta.");
		}
		
	} else if (getver() == 2) {
		if (saque <=getSalDR()) {
			setSalDR(getSalDR() - saque);
		} else {
			System.out.println("Você não possui esse saldo na sua conta.");
		}
	}
		return "Saque realizado com sucesso. Seu novo saldo é: "+getSalDR();
	}
	
	public String dep (float dep) {
		if (getver() == 1) {
			setSalD(getSalD() + dep);
		} else if (getver() == 2) {
			setSalDR(getSalDR() + dep);
		}
		return "Seu dinheiro foi depositado.";
	}
	
	public String aplicar (float aplicar) {
		if (getver() == 1) {
			if (aplicar <=getSalD()) {
				setSalD(getSalD() - aplicar);
				byte d = 1;
				setv(d);
			}
			} else if (getver() == 2) {
				if (aplicar <=getSalDR()) {
					setSalDR(getSalDR() - aplicar);
					byte d = 1;
					setv(d);
				} 
	}
		return "Seu dinheiro foi transferido para sua conta poupança";
	}
	
	public String resgate (float resgate) {
		if (getver() == 1) {
			setSalD (getSalD() + resgate);
		} else if (getver() == 2) {
			setSalDR (getSalDR() + resgate);
		}
		return null;
	}
	
	public byte getv() {
		return v;
	}
	
	public void setv(byte d) {
		this.v =d;
	}
		
}


