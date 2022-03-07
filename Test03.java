package practice;

import java.util.Scanner;

// 재귀 함수 문제
// 백준 10872번 팩토리얼
// 재귀함수에 대해 좀 더 알아보고 다시 생각해 보았다
// factorial
// 3!= 3*2*1 = 6
// 4! = 4*3*2*1 = 24
// 5! = 5*4*3*2*1 = 120

public class Test03 {
	 
	public static void main(String[] args) {
 
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		in.close();
		
		int sum = factorial(N);
		System.out.println(sum);
		
	}
	
	public static int factorial(int N) {
		if(N <= 1) return 1;
		return N * factorial(N - 1);		
	}
	 
}
