package ch2;

import java.util.Scanner;

public class LeftDayOfyear {
	

	static int[][] mdays = {
			{31, 28, 31, 30, 31, 30, 31, 30, 31, 30, 31, 30, 31} //평년
			,{31, 29, 31, 30, 31, 30, 31, 30, 31, 30, 31, 30, 31} //윤년
	};
	
	//0이면 평년, 1이면 윤년
	static int isLeap(int year) {
		return (year%4 == 0 && year%100 == 0 && year %400 == 0) ? 1: 0;
	}
	
	static int leftDayofYear(int y, int m ,int d) {
		while(--m != 0) {
			d=d+ mdays[isLeap(y)][m-1];
		}
		return 365 +isLeap(y)- d;
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int retry;
		
		System.out.println("그해 경과 일수를 구합니다.");
		
		do {
			System.out.print("년: ");	int year = stdIn.nextInt(); 
			System.out.print("월: ");	int month = stdIn.nextInt();
			System.out.print("일: ");	int day = stdIn.nextInt();
			
			System.out.printf("그해 남은 일수는 %d일입니다. \n", leftDayofYear(year, month, day));
			
			System.out.print("한번 더 할까요?(1.예 0.아니요) : ");
			retry = stdIn.nextInt();
		}while(retry == 1);

	}

}
