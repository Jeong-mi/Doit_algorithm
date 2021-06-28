package ch2;

import java.util.Scanner;

public class CardConvRev {
	
	static int cardConv(int x, int r, char[] d) {
		int digits = 0;
		String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		do {
			d[digits++] = dchar.charAt(x%r);
			x = x/r;
		}while(x != 0);
		
		return digits;
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int no;
		int cd;
		int dno;
		int retry;
		char[] cno = new char[32];
		
		System.out.println("10진수를 기수변환합니다.");
		
		do {
			do {
				System.out.print("변환하는 음이 아닌 정수: ");
				no = stdIn.nextInt();
			}while(no < 0);
			
			do {
				System.out.print("어떤 진수로 변환할까요? (2~36)");
				cd = stdIn.nextInt();
			}while(cd<2 || cd>36);
			
			dno = cardConv(no, cd, cno); //main 메서드와 cardconv 메서드는 같은 배열 본체를 참조한다
			
			System.out.print(cd + "진수로는 ");
			for(int i=dno-1; i>=0; i--) 
				System.out.print(cno[i]);
			System.out.println("입니다.");
			
			System.out.print("한 번더 할까요? (1.예, 2.아니요) ");
			retry = stdIn.nextInt();
		
			
		}while(retry == 1);
		

	}

}