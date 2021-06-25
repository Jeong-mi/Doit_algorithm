package algorithm;
import java.util.Scanner;


public class Difference_01_10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("a를 입력하라: ");
		int a = scan.nextInt();
		
		int b;
		do {
			System.out.print("b를 입력하라: ");
			b = scan.nextInt();
			if(b > a)
				break;
			System.out.println("b보다 더 큰 값을 입력하세요!");
		}while(b <= a);
		
		System.out.println("b-a는 "+(b-a)+"입니다.");
		
		
		
		
	

	}

}
