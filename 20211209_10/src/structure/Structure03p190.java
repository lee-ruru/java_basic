package structure;

public class Structure03p190 {

	 public static void getcatInfo(Cat p) {
		 System.out.println(p.name + "의 정보입니다.");
		 System.out.println("이름 : " + p.name + ", 나이 : " + p.age + ", 지역 : " + p.address);
	 }
		
	
	public static void main(String[] args) {
		
	Cat p1 = new Cat();
	
		p1.name = "머쉬";
		p1.age = 2;
		p1.address = "경기";
		
	Cat p2 = new Cat();
		p2.name = "멜로";
		p2.age = 4;
		p2.address = "서울";
		
		getcatInfo(p1);
		getcatInfo(p2);
		
	}
}
