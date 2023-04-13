package day06_0413;

public class BreakEx01 {

	public static void main(String[] args) {

//		for(int i = 1; i<= 10; i++) {
//			System.out.println(i);
//			if(i == 5) break;	// 출력은 4까지 되지만, 반복문은 5까지 실행 된 것
//		}
		
		/* 
		 * 무한 반복문
		 * 반복문의 횟수를 정확히 모를 때 사용
		 * 자바에서는 while(true) 문장을 많이 사용
		 * 특정 조건에서 탈출하는 형식으로 사용
		 */
		int i = 1;
		while(true) {
			System.out.println(i);
			
			if(i == 15) {
				System.out.println("그만");
				break;
			}
			i++;
		}
		
	}

}
