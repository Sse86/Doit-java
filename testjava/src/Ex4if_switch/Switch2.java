package Ex4if_switch;

public class Switch2 {

	public static void main(String[] args) {
		int a=2;
		
	switch(a) {
	        
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

	}
    /*switch 문에 case1은 건너 뛰고 case2가 출력이되고 break;가 있기 때문에
	  switch 문에 탈출이 되기에  그래서 case3과 default 값이 출력되지 않는다. */
    }
