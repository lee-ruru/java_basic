package constructor;

public class Main02p204 {

	public static void main(String[] args) {
		// 실폐사례
		BaketballPlayer a = new BaketballPlayer(175,120);//키, 점프력 순으로전달
		a.dunkShoot();
		// 성공사례
		BaketballPlayer b = new BaketballPlayer(185,120);// 키, 점프 순으로 전달
		b.dunkShoot();
	}

}
