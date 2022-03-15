    package controller;
    public class exer_th_2 extends Thread {
	private int n;
	private int MT[][];

	public exer_th_2(int n, int MT[][]) {
		this.n = n;
		this.MT = MT;
	}
	@Override
	public void run() {
		Mostrar();
	}
    public void Mostrar() {
		int soma = 0;
		for (int c = 0; c < 5; c++) {
			soma += MT[n][c];
		}
		System.out.println("Soma da linha " + (n + 1) + " da matriz= " + soma);
	}
}