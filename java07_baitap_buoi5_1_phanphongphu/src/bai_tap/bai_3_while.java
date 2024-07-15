package bai_tap;

public class bai_3_while {
	public static void main(String[] args) {
		
		int n = 0, dem = 0;
		while (n <= 1000) {
			if (n % 3 == 0) {
				dem ++;
			}
		n++;	
		}
		
		System.out.print("Có " + dem + " chia hết cho 3");
	}
}
