package thiskeyword;

public class Main01p224 {

	public static void main(String[] args) {
		// Person을 두명 생성해 보시되
		// 생성시 지역간 데이터 교환을 염두에 두고 확인해가면서 생성해보세요.
		// 생성된 Person은 getInfo()를 실행합니다.
		
		 Person p1 = new  Person("이하연", 20, 3000, "통계학");
		 p1.getInfo();
		 
		 Person p2 = new  Person("이수민", 30, 4000, "영어");
		 p2.getInfo();
	}

}
