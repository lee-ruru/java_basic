package constructor;

// 농구선수를 자바 내에서 구현합니다.
public class BaketballPlayer {

	public int height;// 키(신장)
	public int jumpHeight;// 점프력
	//변수는 첫당어 첫글자는 소문자, 이후 단어 첫글자는 대문자 나머지는 소문자로 작성
	// 위표기법을 카멜케이스라고 부름니다.
	
	// 생성자 생성
	
	public BaketballPlayer(int h, int j) {
		height = h;
		jumpHeight = j;
		System.out.println("생성된 선수의 키 : " + height + ", 점프력 : " + jumpHeight);
	}
	// 더크슛하기 하는 행동을 작성합니다.
	public void dunkShoot() {
		// 키 + 점프력이 300이 넘는다면 덩크에 성골했다는 메세지를 보내주기위해 조건문 작성
		if((height + jumpHeight) > 300 ) {
			System.out.println("덩크슛에 성공했습니다.");
		}else {
			System.out.println("골대에 닿지 않았습니다.");
		}
	}
}
