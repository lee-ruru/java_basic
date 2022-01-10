package constructor;

public class Main01p204 {

	public static void main(String[] args) {
		// 자동차 한대를 만들어 주세요.
		// 연료량은 100
		// 속도는 0
		// 주인은 본인이름으로만들어주세요
		Car a = new Car("이하연");
		//생성자로 gas, speed, owner를 처리
		//a.gas = 100;
		//a.speed = 0;
		//a.owner = "이하연";
		
		// 차를 뽑자마자 먼저 상태확인
		a.getInfo();
		// 엑셀 두 번 밟아주세요
		a.accelSpeed();
		a.accelSpeed();
		// 상태 다시 확인
		a.getInfo();
		//브레이크를 밟아주세요
		a.breakSpeed();
		//상태 다시확인
		a.getInfo();
		//개솔린 충전
		a.putGas();
		//상태다시확인
		a.getInfo();
	
		
		
	}

}
