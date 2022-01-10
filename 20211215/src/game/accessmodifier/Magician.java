package game.accessmodifier;

public class Magician extends Commoner {

	public Magician(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public void hunt() {
		System.out.println("마법사가 사냥을 시작합니다.");
		// hp -= 2; 를 직접 실행할 수 없으므로
		// public인 setter의 일종인 setHp()를 이용합니다.
		// setHp(5) 인 경우, 기존의 값 대신 hp변수에 5로 교체해달라는 요청임.
		// 현재 원하는것은, 현 hp값에서 사냥할때마다 2씩 체력이 깎이는것입니다.
		setHp(getHp()-2);
		// 경험치도 마찬가지로 
		// exp += 10; 를 직접 실행할 수 없으므로
		// setExp()를 활용합니다.
		// 현재 원하는것은, 현 exp값에서 사냥할때마다 10씩 경험치가 증가하는것입니다.
		setExp(getExp()+10);
	}
	
	// fireball 메서드를 생성해주세요.
	// 마나가 3줄고, 경험치는 20증가합니다.
	public void fireball() {
		System.out.println("마법사가 화염구를 던집니다.");
		setMp(getMp()-3);
		setExp(getExp()+20);
	}
	
	// heal 메서드를 생성해주세요.
	// 마나가 2 줄고 체력이 10 회복됩니다.
	public void heal() {
		System.out.println("마법사가 회복 주문을 외웁니다.");
		setMp(getMp() - 2);
		setHp(getHp() + 10);
	}
	
	
	public void getInfo() {
		// 심지어 private요소는 수정이 아닌 조회도 불가능합니다.
		System.out.println("현재 체력 : " + getHp());
		// 체력뿐만 아니라 나머지 요소들도 조회할 수 있도록 코드를 추가해주세요.
		System.out.println("현재 마나 : " + getMp());
		System.out.println("현재 레벨 : " + getLv());
		System.out.println("현재 경험치 : " + getExp());
		System.out.println("현재 유저명 : " + getName());
	}
}
