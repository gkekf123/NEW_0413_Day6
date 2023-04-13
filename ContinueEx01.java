package day06_0413;

public class ContinueEx01 {

	public static void main(String[] args) {
		
		// continue는 반복문을 건너 뜀
		// for문에서는 증/감식으로 이동됩니다.
		/*
		 * for(int i = 1; i <= 10; i++) {
		 * 
		 * if(i == 5) { continue; }
		 * 
		 * System.out.println(i); }
		 */
		
		
		//while문에서는 contunue는 조건식으로 간다 -> 문제 많이 풀어봐라
		int i = 1;
		while (i<= 10) {
			
			if(i == 5) {
				i++;
				continue;
			}
			System.out.println(i);
				i++;
		}
		
	}
}
