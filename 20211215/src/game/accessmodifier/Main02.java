package game.accessmodifier;

public class Main02 {

	public static void main(String[] args) {
		// 전사 생성 후 3개 이상의 동작을 해 보세요.
		Warrior w1 = new Warrior("전사전사");
		w1.doubleAttack();
		w1.getInfo();
		
		w1.hunt();
		w1.getInfo();

	}

}
