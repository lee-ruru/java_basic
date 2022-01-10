package overriding;

public class Main01p265 {

	public static void main(String[] args) {
		// 말과 돼지를 생성해 보겠습니다.
		Horse h1 = new Horse();
		h1.name = "경주마";
		h1.age = 3;  
		h1.food = "건초";
		h1.rank = 1;
		h1.howl();
		h1.getInfo();
		
		Pig p1 = new Pig();
		p1.name = "꿀꿀이";
		p1.age = 3;
		p1.food = "곡뭏사료";
		p1.weight = 80;
		p1.howl();
		p1.getInfo();
				

	}

}
