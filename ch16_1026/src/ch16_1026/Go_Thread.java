package ch16_1026;

public class Go_Thread extends Thread { //Thread 클래스를 상속받은 
	// Go_Thread 클래스 정의. Thread 클래스를 상속받아서 Go_Thread도 스레드이다.
	   public void run() {
	         while(true){
	          System.out.println("go");
	         } // run() 메소드를 오버라이딩하고, run()메소드 내에서
	         // 무한루프를 실행한다.
	      }
	  }