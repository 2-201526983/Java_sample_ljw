package cooperation;

public class TakeTrans {

	public static void main(String[] args) {
		// 두 명의 학생을 생성
		  Student studentJames = new Student("James", 5000);   
		  Student studentTomas = new Student("Tomas", 10000);
		  
		  //디버깅 한번 수행하고
		  //본인 이름으로 생성 버스 .지하철 타보기
		  
		  Student studentJw = new Student("LJW", 15000); 
		  
		  
		  
		   
		  Bus bus100 = new Bus(100);
		  studentJames.takeBus(bus100);     // james가 100번 버스를 탐
		  studentJames.showInfo();           // james 정보 출력
		  bus100.showInfo();                // 버스 정보 출력
		  
		  Subway subwayGreen = new Subway("2호선");  
		  studentTomas.takeSubway(subwayGreen);  // Tomas가 2호선을 탐
		  studentTomas.showInfo();                 // Tomas 정보 출력
		  subwayGreen.showInfo();   
		  
		  System.out.println("=======================================================");
		  
		  
		  Bus bus101 = new Bus(101);
		  studentJw.takeBus(bus101);
		  studentJw.showInfo();        
		  bus101.showInfo();    
		  
		  Subway subwayOrange = new Subway("1호선");  
		  studentJw.takeSubway(subwayOrange);  
		  studentJw.showInfo();                
		  subwayOrange.showInfo();   
		  
	}
}
