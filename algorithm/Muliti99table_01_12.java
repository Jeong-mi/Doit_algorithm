package algorithm;

public class Muliti99table_01_12 {

	public static void main(String[] args) {
		
		for(int i=0; i<10; i++) {
			
			if(i==0)
				System.out.print(" ");
			else 
				System.out.print(i);
		
			System.out.print("|");
			
			for(int j=1; j<10; j++) {
				if(i==0) {
					System.out.print(j+" " );
					if(j==9) {
						System.out.println("\n");
						System.out.print("-+-------------------------------");
					}
				}
				else {
					System.out.print(i*j+" ");
				}
			}
			
			System.out.println("\n");

		}

	}

}
