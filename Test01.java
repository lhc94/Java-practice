package practice;

import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		System.out.println();
		int b = sc.nextInt();
		System.out.println();
		
		if(a < b) {
			System.out.println("<");
		}
		else if(a == b) {
			System.out.println("==");
		}
		else {
			System.out.println(">");
		}
			
	}
}
