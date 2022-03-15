package view;
import controller.exer_th_2;
public class principal {
	public static void main(String[] args) {
		int MT[][] = new int[3][5];
		for (int c1 = 0; c1 < 3; c1++) {
			for (int c2 = 0; c2 < 5; c2++) {
				MT[c1][c2] = (int) ((Math.random() * 10) + 10);
				System.out.print(MT[c1][c2] + " ");
			}
			System.out.println(";");
		}
		for (int n = 0; n < 3; n++) {
			Thread t = new exer_th_2(n, MT);
			t.start();
		}
	}
}