package protoss;

//object(객체) 상태와 행동을 가진다.
public class Dragoon {
	public Dragoon() {
		this(100,100,20,1);
	}
	
	//매개변수의 타입이나 개수가 다르면 오버로딩
	public Dragoon(int st, int sh, int attack, int armor){
		this.st=st;
		this.sh=sh;
		this.attack=attack;
		this.armor=armor;
		
		System.out.println("I had returned");
	}
	final String name="드라군";
	int st;		//체력
	int sh;		//실드
	int attack;
	int armor;
	
}
