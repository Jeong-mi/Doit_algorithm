package ch3;

import java.util.Scanner;

public class BinSearchX {

	static int BinSearchX(int[] a, int n, int key) {
		int pl=0;
		int pr=n-1;
		
		do {
			int pc = (pl + pr) / 2; // 중앙요소의 index
			if (a[pc] == key) {
				for (; pc > pl; pc--) // key와 같은 맨 앞의 요소를 찾습니다
					if (a[pc - 1] < key)
						break;
				return pc; // 검색성공
			} else if (a[pc] < key)
				pl = pc + 1; // 검색범위를 앞쪽 절반으로 좁힘
			else
				pr = pc - 1; // 검색범위를 뒤쪽 절반으로 좁힘
		} while (pl <= pr);

		return -1; // 검색실패
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("요솟수: ");
		int num = stdIn.nextInt();
		int [] x = new int[num];
		
		System.out.println("오름차순으로 입력하세요.");
		
		System.out.print("x[0]: ");
		x[0] = stdIn.nextInt();
		
		for(int i=1; i<num; i++) {
			do {
				System.out.print("x["+i+"]: ");
				x[i] = stdIn.nextInt();
			}while(x[i] < x[i-1]);
		}
		
		System.out.print("검색할 값: ");
		int ky = stdIn.nextInt();
		
		int idx = BinSearchX(x, num, ky);
		
		if(idx == -1)
			System.out.println("그 값의 요소가 없습니다.");
		else
			System.out.println(ky+"은(는) x["+idx+"]에 있습니다.");
	}

}
