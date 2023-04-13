package day06_0413;

import java.util.Scanner;

public class Quiz17 {

	public static void main(String[] args) {
		
		/*
		 * Scanner sc = new Scanner(System.in); int ocount = 0; int xcount = 0; int a =
		 * (int)(Math.random() * 100 + 1); int b = (int)(Math.random() * 100 + 1); int c
		 * = (int)(Math.random() * 2); String[] arr = {"+", "-"};
		 * 
		 * 
		 * 
		 * while(true) { System.out.println(a + " " + arr[c] + " " + b + " = ");
		 * System.out.print("> ");
		 * 
		 * int answer = sc.nextInt();
		 * 
		 * if(answer == 0) { System.out.println("[문제를 그만 푸시려면 0을 입력하세요]"); break; } }
		 */
		Scanner sc = new Scanner(System.in);
		
		int okcount = 0;
		int nocount = 0;
		
		while(true) {
			
			int a = (int)(Math.random() * 100) + 1;
			int b = (int)(Math.random() * 100) + 1;
			int c = (int)(Math.random() * 2);
			
			
			System.out.println(a + " + " + (c == 0 ? " + " : " - ") + b + " = ?");
			System.out.println("[문제를 그만 푸시려면 0을 입력하세요]");
			System.out.print(">");
			int answer = sc.nextInt();
			
			int correct = c == 0? a + b : a - c;	// 실제 정답
			
			if(answer == 0) {
				System.out.println("정답횟수 : " + okcount);
				System.out.println("오답횟수 : " + nocount);
				break;
			}
			
			if(answer == correct) {
				System.out.println("정답");
					okcount ++;
			} else{
				System.out.println("오답");
					nocount++;
			}
		}
			
		
		
			
		
		
		
	}
}
