package bancoFuctura.contas;

public class ContaPoupanca extends Contas{
	
	private byte v = 0;

	
	public String aplicarP (float aplicar) {
		if (getver() == 1) {
			setSalD (getSalD() + aplicar);
		} else if (getver() == 2) {
			setSalDR (getSalDR() + aplicar);
		}
		return null;
	}
	
	public String resgate (float resgate) {
		if (getver() == 1) {
		if (resgate <= getSalD()) {
			setSalD(getSalD() - resgate);
			byte d = 1;
			setv(d);
		}
	} else if (getver() == 2) {
		if (resgate <= getSalDR()) {
			setSalDR(getSalDR() - resgate);
			byte d = 1;
			setv(d);
		} 
	}
		return "Seu dinheiro foi enviado para sua conta corrente.";
	}
	
	public byte getv() {
		return v;
	}
	
	public void setv(byte d) {
		this.v =d;
	}

}
