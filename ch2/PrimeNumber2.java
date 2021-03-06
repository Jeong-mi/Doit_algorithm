package ch2;

public class PrimeNumber2 {

	public static void main(String[] args) {
		int counter = 0;
		int ptr = 0;
		int[] prime = new int[500];
		
		prime[ptr++] = 2; //소수를 저장하는 배열
		
		for(int n=3; n<= 1000; n++) { //대상은 홀수만
			int i;
			for(i=1; i<ptr; i++) { //이미 찾은 소수로 나누어봄
				counter++;
				if(n%prime[i] == 0) //나누어 떨어지면 소수가 아님
					break;
			
			}
			if(ptr == i) //모두 나누어 떨어지지 않으면 소수임 (개수가 같아짐)
				prime[ptr++] = n;
		}
		
		System.out.println("나눗셈을 실행한 횟수: "+counter);

	}
}
