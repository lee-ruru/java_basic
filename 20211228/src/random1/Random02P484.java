package random1;

import java.util.Random;
import java.util.Scanner;

public class Random02P484 {

	public static void main(String[] args) {
		// Random객체를 생성한 다음 nextBoolean()기능을 이용해서
		// 동전던지기 카운팅 프로그램을 만들어 주세요.
		// n회 던졌을때 true가 나오면 앞면, false가 나오면 뒷면으로 간주해서
		// 프로그램이 다 끝났을때 앞며느 false가 나오면 뒷면으로 간주해서
		// 콘솔에 출력해주세요.
		// 실행 횟수 n회는 스캐너로 입력받습니다.
		Scanner scan = new Scanner(System.in);
		
		System.out.println("동전 던질 횟수를 알려주세요.");
		int count = scan.nextInt();
		//앞면 뒷면 카운팅할 변수생성(0으로시작)
		
		int front = 0;
		int back = 0;
		
		//랜덤 변수 실행 후 반복은 동전 던질 횟수만큼 돌려서
		Random random = new Random();
		for(int i=0; i<count; i++) {
			//random.nextBoolean()이 true면 앞면 1증가
			// false면 뒷면 1증가하도록 조건식 작성
		if(random.nextBoolean()) {
			front++;
		}else {
			back++;
		}
		}
		//다돌고나서 돌인 결과값 콘솔찍기
		System.out.println(count +"바퀴돌린 결과값 : ");
		System.out.println("앞면 : " + front);
		System.out.println("뒷면 : " + back);
		
		
		scan.close();

}
}
