package structure;

public class Structure02p190 {
	// Person 내부의 정보를 쉽게 조휘하기 위한 메서드생성
 public static void getInfo(Person p) {
	 System.out.println(p.name + "의 정보입니다.");
	 System.out.println("이름 : " + p.name + ",나이 : " + p.age + ",연락처" + p.pNum + ",번호" + p.uNum);
 }
	
	public static void main(String[] args) {                 
	// 사람을 두명 만들어보세요(a, b)
		
		Person a = new Person();
		a.name = "머쉬";
		a.age = 2;
		a.pNum = "01011111111";
		a.uNum = 123;
		
		Person b = new Person();
		b.name = "멜로";
		b.age = 4;
		b.pNum = "01022222222";
		b.uNum = 1234;

		getInfo(a);// a의 주소값을 getInfo의 p에 전달
		getInfo(b);// b의 주소값을 getInfo의 p에 전달
	}

}
