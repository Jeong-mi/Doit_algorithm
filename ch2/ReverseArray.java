package ch2;

import java.util.Scanner;

public class ReverseArray {

	static void swap(int[] a, int b, int c) {
		int tmp;
		tmp = a[b];
		a[b] = a[c];
		a[c] = tmp;
	}
	
	static void reverse(int[] a) {
		for(int i=0; i<a.length/2; i++) {
			swap(a, i, a.length-i-1);
		}
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("요솟수: ");
		int num = stdIn.nextInt();
		
		int[] x = new int[num]; //요솟수가 num인 배열 x
		
		for(int i=0; i<num; i++) {
			System.out.print("x["+i+"] : ");
			x[i] = stdIn.nextInt();
		}
		
		reverse(x);
		
		System.out.println("요소를 역순으로 정렬했습니다.");
		for(int i=0; i<num; i++) {
			System.out.println("x["+i+"] : "+x[i]);
		}

	}

}
