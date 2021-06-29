package ch3;

import java.util.Scanner;

public class SeqSearchSen {

	static int seqSearch(int[] x, int n, int key) {
		
		int i=0;
		x[x.length] = key; // 보초 두기
		
		while(true) {
			if(x[i] == key)
				break;
			i++;
		}
		return (i == n) ? -1 : i;
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("요솟수: ");
		int num = stdIn.nextInt();
		int[] x = new int[num+1]; //요솟수 하나 추가(보초용)
		
		for(int i=0; i<num; i++) {
			System.out.print("x["+i+"]: ");
			x[i] = stdIn.nextInt();
		}
		
		System.out.print("검색할 값: ");
		int ky = stdIn.nextInt();
		int idx = seqSearch(x, num, ky);
		
		if(idx == -1)
			System.out.println("그 값의 요소가 없습니다. ");
		else
			System.out.println(ky+"은(는) x["+idx+"]에 있습니다. ");

	}

}
