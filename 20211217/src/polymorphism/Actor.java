package polymorphism;

public class Actor extends Person {
	private String work;
	
	public Actor (String name, int age, String work) {
		super(name, age);
		this.work = work;
		
	}
	public void showPerson() {
		super.showPerson();
		System.out.println("배우의 작품 : " + work);
	}
	
	public void showActor() {
		System.out.println("저는 배우입니다.");
	}
	
} 