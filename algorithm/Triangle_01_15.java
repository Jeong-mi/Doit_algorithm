package algorithm;

public class Triangle_01_15 {
	
	static void triangleLU(int n) {
		for(int i=0; i<n ;i++) {
			for(int j=1; j<=n-i; j++) 
				System.out.print("*");
			
			System.out.println();
		}
	}
	
	static void triangleRU(int n) {
		for(int i=0; i<n ;i++) {
			for(int j=0; j<i; j++) 
				System.out.print(" ");
			for(int j=0; j<n-i; j++)
				System.out.print("*");
				
			System.out.println();
		}
	}

	public static void main(String[] args) {
		triangleRU(5);
	}

}
