package day06_0413;

public class EnganceForEx {

	public static void main(String[] args) {

		int[] arr = {1,2,3,4,5,6,7};
		
		// 향상된 for문 - 배열 같으 ㄴ연속 된 타입을 돌리기에 적합
		for(int i : arr) {
			System.out.println(i);
		}
		System.out.println("--------------------");
		
		String[] str = {"a", "b", "C"};
		for(String i : str) {
			System.out.println();
		}
		System.out.println("--------------------");
		
		//배열 안의 정수들의 합계와 평균(실수형)을 출력
		int[] score = {50,40,30,20,10};
		int sum = 0;
		double avg = 1;
		
		for(int i : score) {
			sum += i;
		}
		avg = sum / (double)score.length;	// 평균 = 합계 / 배열의 길이
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + avg);
		
		
		System.out.println("====================");
		int[] arr2 = {1,2,3,4,5,6,7,8,9};
		for(int i : arr2) {
			if(i % 2 != 0) {
				System.out.println(i);
			}
		}
		System.out.println("--------------------");
		
		
	}

}
