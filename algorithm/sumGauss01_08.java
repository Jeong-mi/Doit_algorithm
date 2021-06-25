package algorithm;
import java.util.Scanner;

public class sumGauss01_08 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("n을 입력하라: ");
		int n = scan.nextInt();
		
		int sum;
		
		sum = (1+n) * (n/2) + (n%2==0 ? 0 : (n+1)/2);
		
		System.out.println(sum);
		

	}

}
