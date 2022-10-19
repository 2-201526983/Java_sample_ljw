package ch3_1018;

public class OperationEx2 {
	public static void main(String[] args) {
	int gameScore = 150;
	
	int lastScore1 = ++gameScore;
	System.out.println(lastScore1);
	
	System.out.println("lastScore1 : " + lastScore1);
	System.out.println("gameScore : " + gameScore);
	
	System.out.println("============================");
	
	int lastScore12 = gameScore++;
	System.out.println("gameScore : " + gameScore);
	System.out.println("lastScore12 : " + lastScore12);
	System.out.println("gameScore : " + gameScore);
	
	System.out.println("============================");
	
	int lastScore2 = --gameScore;
	System.out.println(lastScore2);
	
	System.out.println("lastScore2 : " + lastScore2);
	System.out.println("gameScore : " + gameScore);
	
	System.out.println("============================");
	
	int lastScore22 = gameScore--;
	System.out.println("gameScore : " + gameScore);
	System.out.println("lastScore22 : " + lastScore22);
	System.out.println("gameScore : " + gameScore);
	System.out.println("============================");
	
	
	int myAge = 27;
	boolean value = (myAge > 25);
	System.out.println(value);
	
	System.out.println("value : " + value );
	

}
}
