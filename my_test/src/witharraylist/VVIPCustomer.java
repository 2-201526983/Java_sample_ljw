package witharraylist;

public class VVIPCustomer extends Customer{
	private int Sp_agentID;
	double saleRatio;
	
	public boolean park;
	
	public VVIPCustomer(int customerID, String customerName, int Sp_agentID, boolean park){
		super(customerID, customerName);
	
		customerGrade = "VVIP";
		bonusRatio = 0.15;
		saleRatio = 0.2;
		this.Sp_agentID = Sp_agentID;
		
		bonusPoint = 1000;
		
		this.park =  park;
		
	}
	
	public int calcPrice(int price){
		bonusPoint += price * bonusRatio;
		return price - (int)(price * saleRatio);
	}
	
	public String showCustomerInfo(){
		return super.showCustomerInfo() + " VVIP 전문 상담원 번호는 " + Sp_agentID + "입니다      " + "발렛 파킹 이용가능합니다";  

	}

	public int getAgentID(){
		return Sp_agentID;
	}
	
	
	

	static void park(String[] args){

		
		boolean yes = true;
		boolean no = false;

		if(yes) {		
		System.out.println("발렛파킹 이용중");
		}
		if(no) {
		System.out.println("발렛파킹 이용X");
	}
	
	}
	

	
}
