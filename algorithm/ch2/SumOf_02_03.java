package ch2;

import java.util.Scanner;

public class SumOf_02_03 {
	
	static int sumOf(int[] a) {
		int sum = 0;
		for(int i=0; i<a.length; i++) {
			sum += a[i];
		}
		
		a[3] = 8; //함수에서 바뀐 정보는 main함수에서도 그대로 적용된다!
		return sum;		
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
		
		System.out.println("배열의 모든 요솟수의 합계는 "+ sumOf(x));
		
		for(int i=0; i<num; i++) 
			System.out.print("x["+i+"] : "+x[i]);
		

	}

}
