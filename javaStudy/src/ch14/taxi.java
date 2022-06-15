package ch14;

import java.util.Scanner;

public class taxi {

	private String taxiName;
	private int taxiIncome;
	private int taxiFee;
	
	public int getTaixFee() {
		return taxiFee;
	}
	
	public taxi(String taxiName) {
		this.taxiName = taxiName;
	}

	public void takeTaxi() {//탄다
		TaxiFee();
	}
	
	public void TaxiFee() {//지불 요금
		Scanner scan = new Scanner(System.in);
		System.out.println("도착했습니다.");
		int fee = scan.nextInt();
		System.out.println("요금은" + fee + "입니다");
		this.taxiIncome += people.responseFee(fee);
	}
	
	public void TaxiIncome() {
		System.out.println("수익은" + this.taxiIncome  + "입니다");
	}
	
}
