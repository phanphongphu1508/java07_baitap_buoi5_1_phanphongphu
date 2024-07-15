package bai_tap;
import java.util.Scanner;

public class bai_2 {
	public static void main(String[] args) {
		
		// Gọi hàm banPhim để lấy tham số truyền từ bàn phím và gán cho biến n
		int n = banPhim();
		
		// Gọi hàm tính tổng số nguyên dương tham số truyền vào n nhập từ bàn phím
		int ketQua = tinhTongSoChan(n);
		
		// In ra màn hình kết quả
		System.out.print("Tổng các số chẵn là: " + ketQua);
	}
	
	// Hàm có giá trị trả về là n
	public static int banPhim() {
		int n;
		Scanner scan = new Scanner(System.in);
		// Nếu số nguyên nhỏ hơn 1 yêu cầu nhập lại
		do {
			System.out.print("Nhập vào số nguyên lớn hơn 0: ");
			n = scan.nextInt();
		} while (n < 1);
		scan.close();
		return n;
	}
	
	// Hàm tính tổng có tham số n được truyền vào từ bàn phíms
	public static int tinhTongSoChan(int n) {
		int tinhTong = 0;
		// Vòng lặp i phải nhỏ hơn hoặc bằng tham số truyền vào
		for (int i = 1; i <= n; i++) {
			// kiểm tra nếu i chia 2 phần dư bằng 0 thì cộng dồn giá trị
			if (i % 2 == 0) {
				tinhTong += i;		
			}
		}
		return tinhTong;
	}
}
