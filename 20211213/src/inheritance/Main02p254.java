package inheritance;

public class Main02p254 {

	public static void main(String[] args) {
		//여기에 학생 하나와 샐러리맨 하나를 임의로 만들어보세요.
		// 샐러리맨에는 본인 이름과 희만 연봉을 적어주세요.
		// 학생은 그냥 알아서 작성해주세요.
		
		Student st1 = new Student();
		st1.name = "아무개";
		st1.age = 35;
		st1.stuNum = 35;
		
		st1.getInfo();
		st1.getStudentInfo();
		
		Salaryman sm1 = new Salaryman();
		sm1.name = "이하연";
		sm1.age = 26;
		sm1.salary = 150000000;
		
		sm1.getInfo();
		sm1.getSalarymanInfo();
		
		
	}

}
