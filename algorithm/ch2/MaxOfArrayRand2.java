package ch2;

import java.util.Random;
import java.util.Scanner;

public class MaxOfArrayRand2 {

	static int maxOf(int[] a) {
		int max = a[0];
		for(int i=1; i<a.length; i++) {
			if(max < a[i]) {
				max = a[i];
			}
		}
		return max;
	}

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("키의 최대값을 구합니다.");
		System.out.print("사람 수: ");
		int num = 1+rand.nextInt(20); //1~20명의 난수
		System.out.print(num);
		
		int[] height = new int[num];
		
		System.out.println("\n키 값은 아래와 같습니다.");
		for(int i=0; i<num; i++) {
			height[i] = 100+rand.nextInt(90);
			System.out.println("height["+ i +"]:" + height[i]);
		}
		
		System.out.println("최대값은 "+maxOf(height)+"입니다.");

	}

}
