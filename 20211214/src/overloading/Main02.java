package overloading;

public class Main02 {

	public static void main(String[] args) {
		// 알바생 둘을 만들어주세요.
		// 하나는 시급을 15000원 으로 해주시고
		// 다른 하나를 입력없이 생성해주세요.
		
		 Parttimer p1 = new  Parttimer(false, 15000, "파리바게트", "이하연");
		 Parttimer p2 = new  Parttimer(true, "뚜레쥬르", "이하연2");
		 Parttimer p3 = new  Parttimer(false, 10000, "투썸", "이하연3");
	}
}
