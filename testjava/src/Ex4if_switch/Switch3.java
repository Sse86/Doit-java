package Ex4if_switch;

public class Switch3 {

	public static void main(String[] args) {
		int a=8;
		
		switch(a){
		case 10:
			System.out.println("Pass");
			break;
		
		case 9:
			System.out.println("Pass");
			break;
		
		case 8:
			System.out.println("Pass"); //실행 후 switch 문 탈출 
			break;
			
		case 7:
			System.out.println("Pass");
			break;
			
		default:
			System.out.println("Fail");
		}

	}

}
