package Ex3Operator;

public class Doit1Operator {

	public static void main(String[] args) {
              int a=3;
              ++a;
              System.out.println(a); //4
              
              int b=3;
              b++;
              System.out.println(b); //4
              
              int a1=3;
              int b1= ++a1;
              System.out.println(a1);//4
              System.out.println(b1);//4
              
              int a2=3;
              int b2=a2++;
              System.out.println(a2);//4
              System.out.println(b2);//3
              
	}

}
