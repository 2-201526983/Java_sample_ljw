package ch4_1018;

public class ForExample1 {
	public static void main(String[] args) {

		int i;
		int sum;
		for(i=0, sum=0; i<10; i++){
			
			sum += (i+1);
		}
		
		System.out.println("1부터 10까지의 합은 " + sum + "입니다.");
		
		
		int i2;
		for(i2=1; i2<=10; i2++){
		
		   System.out.println("안녕하세요" + i2);	
		}
	}
}
