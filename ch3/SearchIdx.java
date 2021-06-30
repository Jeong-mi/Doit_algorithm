package ch3;

import java.util.Scanner;

public class SearchIdx {

	static void searchIdx(int[] x, int n, int key, int[] idx) {
		
		x[n] = key; // 보초 두기
		
		boolean flag=false;
		int k=0;
		
		for(int i=0; i<n; i++) {
			if(x[i] == key) {
				flag = true;
				idx[k++] = i;
			}	
		}
		
		if(flag) {
			System.out.print(key+"와 일치하는 모든 요소의 인덱스는 ");
			for(int i=0; i<idx.length; i++) {
				if(idx[i] != 0) 
					System.out.print(idx[i]+" ");
					
			}
			System.out.print("입니다. \n");
			System.out.println("개수는 "+k+"개입니다.");
		}
		else
			System.out.println("그 값의 요소가 없습니다. ");

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
		
		int[] idx = new int[num]; //key와 일치하는 모든 요소의 인덱스 저장. (최대 크기는 n)
		
		searchIdx(x, num, ky, idx);
		
	}


}
