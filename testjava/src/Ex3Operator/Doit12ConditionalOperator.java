package Ex3Operator;

public class Doit12ConditionalOperator {

	public static void main(String[] args) {
		// 삼항 연산자
		int value1 =(3>5) ? 6:9; 
		System.out.println(value1);// 거짓 값인 9가 호출
		
		int value2 = (5>3) ? 10 :20;
		System.out.println(value2); // 참인 값인 10이 호출 
		
		int value3=3;
		System.out.println((value3 % 2 == 0) ? "짝수" : "홀수");
		
		//cf. if -else 구문으로 변환
		
		if(value3 % 2 ==0) {
			System.out.println("짝수"); // 참
			
		}else {
			System.out.println("홀수"); //거짓
		}

	}

}
