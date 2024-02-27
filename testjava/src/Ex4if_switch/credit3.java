package Ex4if_switch;

public class credit3 {

	public static void main(String[] args) {
        int a=85;
        if(a >=70 && a< 80) {
        	System.out.println("C학점");
        }
        else if(a >=80 && a<90) {
        	System.out.println("B학점");
        }
        else if (a >= 90) {
        	System.out.println("A학점");
        }
        else {
        	System.out.println("F학점");
        }
	}

}
