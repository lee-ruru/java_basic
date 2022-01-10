package polymorphism;

public class Main02p302 {
	
	public static void main(String[] args) {
		//개발자 생성 및 정보조회, Person으로 개발자를 받음.
		Person si1 = new Singer("싸이", 50, "젠틀맨" );
		Person a1 = new Actor("성동일", 60, "응답하라1997");
		
		
		si1.showPerson();
		a1.showPerson();

	}

}
