package Ex4if_switch;

public class Switch5 {

	public static void main(String[] args) {
		int a=8;
		
		switch(a) {
		case 10:
		case 9:
			System.out.println("A");
		case 8:
			System.out.println("B"); // 실행 후 탈출
			break;
		case 7:
			System.out.println("C");
			break;
			
		default:
			System.out.println("D");
		}
		//if 문
		
	if(a >=9) {
		System.out.println("A");
		}else  if(a == 8) {
			System.out.println("B"); // 실행 후 탈출
		}else if(a == 7) {
			System.out.println("C");
		}else {
			System.out.println("D");
		}
	
	}

}
