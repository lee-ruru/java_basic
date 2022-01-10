package polymorphism;

// Person상속
public class Singer extends Person {
	
	//가수언어
	private String song;
	
	public Singer(String name, int age, String song) {
		super(name, age);
		this.song = song;
		
	}
	public void showPerson() {
		super.showPerson();// 부모측 조회메서드 호출
		System.out.println("가수의 노래 : " + song);
	}
	
	public void showSinger() {
		System.out.println("저는 가수입니다.");
	}
	
}
