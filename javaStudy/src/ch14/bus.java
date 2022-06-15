package ch14;

public class bus {
	
	private String busNumber;
	private int busMoney;
	private int busCount;
	private int busFee = 1200;

	public bus(String busNumber) {
		this.busNumber = busNumber;
	}
	
	public void takeBus(int busMoney) {
		this.busMoney += busMoney;
		this.busCount ++;
		System.out.println(this.busNumber + "번 버스의" +"매출은" + this.busMoney + "원입니다. 승객 " + this.busCount + "명이 이용했습니다"  );
	}
	
	public void errorBus() {
		System.out.println("잔액이 부족합니다.");
	}
	
	public int getBusFee() {
		return busFee;
	}
	
}
