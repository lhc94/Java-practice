package practice;

import java.util.Scanner;

// 재귀 함수 문제
// 백준 10872번 팩토리얼

public class Test02 {
	// 처음엔 재귀에 익숙하지 않아서 재귀를 사용하지 못했다
	public static void main(String[] args) {
		 
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		in.close();
		
		int sum = 1;
        
		// N 이 0이 아닐 때 까지 1씩 감소하면서 sum에 반복적으로 곱해준다
		while(N != 0) {
			sum = sum * N;
			N--;
		}
        
		System.out.println(sum);
		
	}

}
