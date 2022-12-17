package Java0719.extend1;

public class CustomerTest {

	public static void main(String[] args) {
		
		VIPCustomer vipCustomer = new VIPCustomer();
		
		vipCustomer.setCustomerName("김유신");
		vipCustomer.setCustomerID(10020);
		vipCustomer.bonusPoint = 10000;
		System.out.println(vipCustomer.showCustomerInfo());

		
	}
}
