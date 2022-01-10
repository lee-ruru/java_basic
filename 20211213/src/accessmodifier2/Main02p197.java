package accessmodifier2;

import accessmodifier.Warrior;

public class Main02p197 {

	public static void main(String[] args) {
		Warrior w1 = new Warrior("전사전사");
		//w1.hp = 10000000;
		// hp가 package friendly일때
		//Package가 달라서 hp변경불가
		w1.hunt();
		w1.hunt();
		w1.hunt();

	}

}
