package day06_0413;

import java.util.Scanner;

public class ContunueEx02 {

	public static void main(String[] args) {

		//continue의 활용
		
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 > ");
		int num = sc.nextInt();
		int sum = 0;	// 소수의 합을 누적 변수

		
		
		x:for(int i = 1; i <= num; i++) {
			
			int count = 0;	// 약수의 개수를 셀 변수
			
			for(int j = 1; j <= i; j ++) {
				if( i % j == 0) {	// i를 j로 나누었을때 0
					count ++;
				}
				
				if(count > 2) continue x;
				
				
			}//	end for
				if( count == 2) { // 소수를 sum에 누적
					//i는 소수
					sum += i; // sum에 i를 누적
			}
		}
			System.out.println("약수의 합 : " + sum);
		
	}

}
