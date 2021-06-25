package algorithm;
import java.util.Scanner;

public class sumFor {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("n을 입력하라: ");
		int n = scan.nextInt();
		
		int sum=0;
		for(int i=1; i<=n; i++) {
			sum+=i;
		}
		
		for(int i=1; i<=n ;i++) {
			if(i < n) {
				System.out.print(i+"+");
			}
			else {
				System.out.print(i);
			}
			sum+=i;
			
		}
		System.out.print("="+sum);

	}

}
