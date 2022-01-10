package structure;

public class Car {//정의부

	// 멤버변수
	// 멤버변수는 어떤 특정한 사물이나 객체위 "상태"를 나타냅니다.
	public String model;//모델명
	public int price;// 가격
	public String owner; // 주인
	
	// 멤버 메서드 어떤특정한 사물이나 객체의 "동작"을 나타냅니다.
	public void getInfo() {
		System.out.println(model + "의 차정보입니다.");
		System.out.println("모델명 : " + model + 
				", 가격 : " + price + 
				", 주인 : " + owner);

	}
	
	
}
