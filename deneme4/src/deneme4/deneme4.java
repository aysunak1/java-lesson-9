package deneme4;

import java.util.Scanner;

public class deneme4 {

	public static void main(String[] args) {

	Scanner scanner = new Scanner(System.in);
	System.out.println("L�tfen bir say� giriniz:");
	int sayi = scanner.nextInt();
	
	boolean asalMi = false;

	for (int i = 2; i <sayi; i++) {
		if (sayi % i ==0) {
			asalMi= false;
			break;
		}
		else {
			asalMi = true;
		}
	}
	if (sayi==2) {
		asalMi= true;
	}
	if (asalMi) {
		System.out.println(sayi +" say�s� asald�r.");
	}else {
		System.out.println(sayi + " say�s� asal de�ildir.");
	}
	}

}
