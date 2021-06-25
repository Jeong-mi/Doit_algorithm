package algorithm;

public class Sumof_01_09 {
	
	static int sumof(int a, int b) {
		int sum=0;
		int tmp;
		
		if(a > b) {
			tmp = a;
			a = b;
			b = tmp;
		}
			
	
		for(int i=a; i<=b; i++) {
			sum += i;
		}
		return sum;
	}

	public static void main(String[] args) {
		System.out.println(sumof(6, 4));

	}

}
