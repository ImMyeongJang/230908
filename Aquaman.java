package day08;

public class Aquaman {
	
	String name;
	int height;
	double speed;
	
	//생성자 오버로딩 2개 이상 만들기
	//main()에서 Aquaman객체 생성해서 정보 출력하기
	//this()를 이용해서 초기화하세요
	public Aquaman() {
		this("아쿠아맨",160,0.0);
//		name="아쿠아맨";
//		height=160;
//		speed=0.0;
	}
	
	public Aquaman(String n, int h, double s) {
		this(h, s, n);
//		name=n;
//		height=h;
//		speed=s;
	}
	
	public Aquaman(int h, double s, String n) {
		name=n;
		height=h;
		speed=s;
	}
	
	public String showInfo() {
		String str="----아쿠아맨 정보----\n";
			str+="이름: "+name+"\n키 : "+height+"\n스피드: "+speed;
			return str;
	}//showInfo()

}
