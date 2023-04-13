package day06_0413;

import java.util.Scanner;

public class Quiz15 {

	public static void main(String[] args) {

		/* 
		 * 입력받은 수 까지의 소수들의 합
		 * 입력 7
		 * -> 바깥 반복문은 7까지 회전
		 * System.out.println(i + " " + j);
		 * 각각의 i값이 소수인지를 판별해서 소수라면, sum에 누적하는 코드
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 > ");
		int num = sc.nextInt();
		int sum = 0;	// 소수의 합을 누적 변수

		
		
		for(int i = 1; i <= num; i++) {
			int count = 0;	// 약수의 개수를 셀 변수
			for(int j = 1; j <= i; j ++) {
				if( i % j == 0) {	// i를 j로 나누었을때 0
					count ++;
				}
				
			}//	end for
				if( count == 2) { // 소수를 sum에 누적
					//i는 소수
					sum += i; // sum에 i를 누적
			}
		}
			System.out.println("약수의 합 : " + sum);
			
	}

}
