package Ex4if_switch;

public class Doit_SwitchControlStatement {

	public static void main(String[] args) {
		//break 가 포함되지 않았을때 
		int value1 =2;
		switch(value1) {
		case 1:
			System.out.println("A");
		case 2:
			System.out.println("B"); //switch 에서 case1 건너뛰고 
			                         //case2부터 계속 실행 됨   
		case 3:
			System.out.println("C");
		default:
			System.out.println("D");
		}
		System.out.println();
		
	
         //break 가 포함돼 있을 때  
	    int value2 =2;
	    
	    switch(value2) {
	    
	     case 1:
	    	 System.out.println("A");
	    	break;
	     case 2:
	    	 System.out.println("B");	                   
	    	 break;
	     case 3:
	    	 System.out.println("C");
	    	 break;
	    default:
	    	System.out.println("D");
	    }
	    System.out.println();
	    
	    //if - else if- else 구문으로 변환
	    
	    if(value1 ==1) {
	    	System.out.println("A");
	    }
	    else if(value1 == 2) {
	    	System.out.println("B");
	    	
	    }
	    else if(value1 == 3) {
	    	System.out.println("C");
	    }
	    else {
	    	System.out.println("D");
	    }
   }  
}
