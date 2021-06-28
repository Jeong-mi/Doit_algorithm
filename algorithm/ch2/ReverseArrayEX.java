package ch2;

import java.util.Scanner;

public class ReverseArrayEX {

	static void swap(int[] a, int b, int c) {
		int tmp;
		tmp = a[b];
		a[b] = a[c];
		a[c] = tmp;
	}
	
	static void reverse(int[] a) {
		for(int i=0; i<a.length/2; i++) {
			System.out.println("a["+ i +"]과(와) " + "a[" + (a.length-i-1) + "]를 교환합니다.");
			swap(a, i, a.length-i-1);
			
			for(int k=0; k<a.length; k++) 
				System.out.print(a[k]+" ");
			System.out.println();
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
		
		for(int k=0; k<x.length; k++) 
			System.out.print(x[k]+" ");
		System.out.println();
		
		reverse(x);
		
		System.out.println("역순 정렬을 마쳤습니다. ");
		
	}

}
