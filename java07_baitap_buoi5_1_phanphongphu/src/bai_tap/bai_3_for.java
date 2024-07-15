package bai_tap;

public class bai_3_for {
	public static void main(String[] args) {
		
		int n = 0;
		for (int i = 0; i <= 1000; i++) {
			if (i % 3 == 0) {
				n++;
			}
		}
		System.out.print("Có " + n + " số chia hết cho 3");
	}
}
