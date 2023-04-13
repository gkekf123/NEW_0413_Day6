package day06_0413;

import java.util.Scanner;

public class Quiz16 {

	public static void main(String[] args) {
		
		/* 
		 * up, down 게임
		 * 1 ~ 100까지 랜덤한 수를 1번 생성 (반복문 밖에서)
		 * 스캐너를 통해서 값을 입력 받는다.
		 * 랜덤 수가 입력받은 값보다 작으면 "더 작은 수를 입력하세요"
		 * 랜덤 수가 입력받은 값보다 크면 "더 큰수를 입력"
		 * 
		 * 정답을 맞추면 시도횟수 : X회 를 출력하고 종료
		 */
		
		int n = (int)(Math.random() * 100) + 1;
		
		Scanner sc = new Scanner(System.in);
		int count = 0;	// 시도횟수
		
		while(true) {
			
			System.out.print("숫자 입력 > ");
			
			int answer = sc.nextInt();
			count ++;
			
			if(answer < n) {	// 정답이 입력보다 큰 경우
				System.out.println("더 큰수를 입력 하시오");
			} else if(answer > n) {	//정답이 입력보다 작은 경우
				System.out.println("더 작은 수를 입력 하시오");
			} else {	// 정답
				System.out.println("정답");
				break;
			}
			System.out.println("시도횟수 : " + count);
		}
		
		
		
	}
}
