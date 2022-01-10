package constructor;

public class Webtoon {

	public String name;
	public int series;
	public String painter;
	public boolean complete;
	
	//생성자
	public Webtoon(String n, String p) {
		name = n;
		series = 1; // 모든웹툰은 첫회차가 1회차 이므로
		painter = p;
		complete = false;
	
	}
	// 클래스 내부에서 메서드 만드는방법
	// public 리턴자료형(int, void등) 메서드명(요구할 자료들...){
	// 실행할 내용들,,,;
	// }
	public void getInfo() {
		System.out.println("제목은 : " + name + ", 회차는 : " + series +
				", 작가는 : " + painter + ", 완결여부는" + complete);
	}
	
	public void uploadWbtoon( ) {
		// 회차가 진행될때 만다 series를 1씩 올려줍니다.
		series += 1;
	}
	public void completeWebtoon() {
			complete = true;
	}
	
	
}
