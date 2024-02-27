package Ex4if_switch;

public class DoitIfControlStatement {

	public static void main(String[] args) {
        int value1 =5;
        if(value1 >3) {
        	System.out.println("실행1"); 
        	//(조건)이 true 값이기 때문에 실행 됨
        }
       if(value1 <5) {
    	   System.out.println("실행2"); 
    	   //(조건)false 가 실행 안됨
       }
       boolean bool1 = true;
       boolean bool2 = false;
       if(bool1) {
    	   System.out.println("실행3"); 
    	   //true 값이기 때문에 실행 됨 
       }
       if(bool2) {
    	   System.out.println("실행4");
    	   //false 값이기 때문에 실행 안됨
       }
       int value2 =5;
       if(value2 >3) {
    	   System.out.println("실행5"); 
    	   //(조건)true 값이기 때문에 실행 됨
       }
       else {
    	   System.out.println("실행6");
    	    
       }
     //삼항 연산자 변환 가능
       System.out.println((value2 >3)? "실행5":"실행6" );
       System.out.println();
       
       int value3 =85;
       if(value3 >=90) {
    	   System.out.println("A학점");
    	}
       else if(value3 >= 80) {
    	   System.out.println("B학점");
       }
       else if(value3 >= 70) {
    	   System.out.println("C학점");
       }
       else {
    	   System.out.println("F학점");
       }
       if(value3 >= 70) {
    	   System.out.println("C학점");
       }
       else if(value3 >=80) {
    	   System.out.println("B학점");
       }
       else if(value3 >=90) {
    	   System.out.println("A학점");
       }
       else {
    	   System.out.println("F학점");
       }
       if(value3 >=70 && value3 <80) {
    	   System.out.println("C학점");
    	   
       }
       else if(value3 >=80 && value3<90) {
    	   System.out.println("B학점");
       }
       else if(value3 >= 90) {
    	   System.out.println("A학점");
       }
       else {
    	   System.out.println("F학점");
       }
	}

}
