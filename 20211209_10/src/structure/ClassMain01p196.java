package structure;

public class ClassMain01p196 {
	// PersonClass의 메서드는 작성할 필요가 없습니다.
	// 이미  PersonClass의 내부에 필요한 메서드를 다 작성해놨기 때문입니다.
	public static void main(String[] args) {
		// 사람을 두명 만들어보세요.
		PersonClass p1 = new PersonClass();
		
		p1.name = "이하연";
		p1.age = 26;
		p1.pNum = "01011111111";
		p1.uNum = 1111;
		p1.glasses = false;
		
		PersonClass p2 = new PersonClass();
		p2.name = "김화원";
		p2.age = 26;
		p2.pNum = "01022222222";
		p2.uNum = 2222;
		p2.glasses = false;
		
		//만든 사람 두 명의 정보를 콘솔에 찍어보세요.
		// 힌트 : getInfo의소속은?
		p1.getInfo();
		p2.getInfo();
	}

}
