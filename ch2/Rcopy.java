package ch2;

import java.util.Scanner;

public class Rcopy {

	static void rcopy(int[] a, int[] b) {
		
		for(int i=0; i<a.length; i++) {
			a[i] = b[a.length-1-i];
		}
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("배열 b의 요솟수: ");
		int nb = stdIn.nextInt();
		
		int[] b = new int[nb];
		
		for(int i=0; i<nb; i++) {
			System.out.print("b["+i+"] : ");
			b[i] = stdIn.nextInt();
		}
		
		int[] a = new int[nb];
		
		rcopy(a, b);
		
		System.out.print("배열 a의 값들: ");
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i] + " ");
		}
		
		System.out.print("\n배열 b의 값들: ");
		for(int i=0; i<b.length; i++) {
			System.out.print(b[i] + " ");
		}


	}

}
