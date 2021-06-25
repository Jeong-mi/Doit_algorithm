package algorithm;
import java.util.Scanner;


public class DigitsNo_01_11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("양의 정수를 입력하라: ");
		int num = scan.nextInt();
		
		int no=0;
		while(num > 0) {
			num /= 10;
			no++;
		}
		
		System.out.println("그 수는 "+no+"자리입니다.");
		
		
		

	}

}
