package algorithm;

public class Pyramid_01_16 {
	
	static void spira(int n) {
		for(int i=1; i<=n; i++) {
			for(int k=1; k<=n-i; k++)
				System.out.print(" ");
			for(int k=1; k<=(i-1)*2+1; k++)
				System.out.print("*");
			
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		spira(5);

	}

}
