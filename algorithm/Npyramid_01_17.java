package algorithm;

public class Npyramid_01_17 {

	static void npira(int n) {
		for(int i=1; i<=n; i++) {
			for(int k=1; k<=n-i; k++)
				System.out.print(" ");
			for(int k=1; k<=(i-1)*2+1; k++)
				System.out.print(i%10);
			
			System.out.println();
		}
	}
	public static void main(String[] args) {
		npira(6);

	}

}
