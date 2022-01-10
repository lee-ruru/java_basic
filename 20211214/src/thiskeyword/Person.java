package thiskeyword;

public class Person {
	// 사람의 정보를 여기 기입합니다.
	private String name;//이름
	private int age;//나이
	private int money;//소지금
	private String major;//전공

	public Person(String name, int age, int money , String major) {
		this.name = name;
		this.age = age;
		this.money = money;
		this.major = major;
	}
	//이름, 나이, 소지금액, 전공을 콘솔에 찍어주는 getInfo()를 작성해주세요.
	
	public void getInfo() {
		System.out.println("이름 : " + this.name);
		System.out.println("나이 : " + this.age);
		System.out.println("소지금 : " + this.money);
		System.out.println("전공 : " + this.major);
	}
}
