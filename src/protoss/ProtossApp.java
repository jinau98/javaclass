package protoss;

public class ProtossApp {
	
	//����, ������
	public static void attack(Dragoon u1, Zealot u2){
		//���� ���ݷ� : 16
		//��� ���� : 1
		int damage = u1.attack - u2.armor;
		u2.sh = u2.sh - damage;
		
	}
	public static void attack(Zealot u1, Zealot u2){
		//���� ���ݷ� : 16
		//��� ���� : 1
		int damage = u1.attack - u2.armor;
		u2.sh = u2.sh - damage;
	}
	
	public static void printUnit(Dragoon u2){
		System.out.println("����� �ǵ�� "+u2.sh);
	}
	
	public static void printUnit(Zealot u2){
		System.out.println("������ �ǵ�� "+u2.sh);
	}
	
	
	//����!!
	public static void main(String[] args) {
		Gateway gate1 = new Gateway();
		Zealot z1 = gate1.makeZealot();			//new Zealot(); (X) main�� ���� ������ å�� X
		Zealot z2 = gate1.makeZealot();
		
		Dragoon d1 = gate1.makeDragoon();
		Dragoon d2 = gate1.makeDragoon();
		
		
		ProtossApp.attack(d1, z1);
		ProtossApp.printUnit(z1);
	}
}
