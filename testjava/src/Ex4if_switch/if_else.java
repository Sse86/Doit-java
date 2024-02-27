
package Ex4if_switch;

public class if_else extends If {

	public static void main(String[] args) {
		if(5>3) {
			System.out.println("실행1"); //실행 됨
		}else {
			System.out.println("실행2"); //실행 안됨
		}
		
		int a,b;
		a= 5; b=0;
		
		if(a>5) {
			b=10; //실행 안됨
		}else {
			b=20; //실행 됨
		}
       System.out.println(b);//20
	

	a=5; b=0;
	b = (a>5) ? 10:20;
	System.out.println(b);//20
	}
}


