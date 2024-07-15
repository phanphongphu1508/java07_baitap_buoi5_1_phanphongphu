package bai_tap;
public class bai_1 {
	public static void main(String[] args) {
		
		System.out.print("Số chẵn: ");
		soChan();
		
		System.out.print("\nSố lẻ: ");
		soLe();
	}
	// Hàm số chẵn
	public static void soChan() {
		int[] n = new int[100];
		for (int i = 0; i < n.length; i += 2) {
			System.out.print(i + " ");
		}
	}
	// Hàm số lẻ
	public static void soLe() {
		int n = 1;
		while (n < 100) {
			System.out.print(n + " ");
			n += 2;
		}
	}
}