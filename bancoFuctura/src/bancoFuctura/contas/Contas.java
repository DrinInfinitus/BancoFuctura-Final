package bancoFuctura.contas;

public abstract class Contas {
	
	private int numC;
	private String nomT;
//	private float SalC;
//	private float SalP;
	private float SalD;
	
	private int numCR = 717;
	private String nomTR = "RB";
	private int senha =717;
//	private float SalCR = 1200f;
//	private float SalPR = 2000f;
	private float SalDR = 1000;
	
	private int ver = 0;
	
	
	public void dados (int C, String T) {
		System.out.println("Número da Conta: "+C
				+"\nNome do Títular: "+T);
	}
	
	public void saldo (float SC, float SP) {
		System.out.println("\nSaldo da Conta Corrente: " +SC
				+"\nSaldo da sua poupança: "+SP);
	}
	
	public int getnumC() {
		return numC;
	}
	
	public void setnumC (int numC) {
		this.numC = numC;
	}
	
	public String getnomT() {
		return nomT;
	}
	
	public void setnomT (String nomT) {
		this.nomT = nomT;
	}
	
	public float getSalD () {
		return SalD;
	}
	
	public void setSalD (float SalD) {
		this.SalD = SalD;
	}
	
//	public float getSalC () {
//		return SalC;
//	}
//	
//	public void setSalC (float SalC) {
//		this.SalC = SalC;
//		this.SalD = SalD+SalC;
//	}
//	
//	public float getSalP () {
//		return SalP;
//	}
//	
//	public void setSalP (float SalP) {
//		this.SalP = SalP;
//		this.SalD = SalD+SalP;
//	}
	
	public int getnumCR () {
		return this.numCR;
	}
	
	public String getnomTR () {
		return this.nomTR;
	}
	
	public int getsenha () {
		return this.senha;
	}
	
	public float getSalDR () {
		return this.SalDR;
	}
	
	public void setSalDR (float SalDR) {
		this.SalDR = SalDR;
	}
	
//	public float getSalCR () {
//		return this.SalCR;
//	}
//	
//	public void setSalCR (float SalCR) {
//		this.SalCR = SalCR;
//		this.SalDR = SalDR+SalCR;
//	}
//	
//	public float getSalPR () {
//		return this.SalPR;
//	}
//	
//	public void setSalPR (float SalPR) {
//		this.SalPR = SalPR;
//		this.SalDR = SalDR+SalPR;
//	}
	
	public int getver() {
		return this.ver;
	}
	
	public void setver(byte ver) {
		this.ver = ver;
	}

}
