package Java0719.extend1;

public class VIPCustomer extends Customer {

	double salesRatio;
	String agentID;
	
	public VIPCustomer() {
		super("ㅁㄴㅇ"); //상속을 받는 상위클래스가 있을 경우 super을 통해 상위클래스 생성자 호출 생략 가능
		customerGrade = "VIP";
		salesRatio =super.bonusRatio;
		bonusRatio = 0.05;
		System.out.println("vipcustomer 호출");
	}

	public double getSalesRatio() {
		return salesRatio;
	}

	public void setSalesRatio(double salesRatio) {
		this.salesRatio = salesRatio;
	}

	public String getAgentID() {
		return agentID;
	}

	public void setAgentID(String agentID) {
		this.agentID = agentID;
	}
	
	
	
}
