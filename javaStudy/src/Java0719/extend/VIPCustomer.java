package Java0719.extend;

public class VIPCustomer extends Customer {

	double salesRatio;
	String agentID;
	
	public VIPCustomer() {
		
		customerGrade = "VIP";
		salesRatio = 0.1;
		bonusRatio = 0.05;
		
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
