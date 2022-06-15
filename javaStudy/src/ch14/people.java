package ch14;

public class people {

	private String name;
	private static int money;
	
	public people(String name, int money) {
		this.name = name;
		people.money = money;
	}
	
	public void takeTaxi(taxi taxi) {
		taxi.takeTaxi();
	}

	public static int responseFee(int taixFee) {
		if (money >= taixFee) {
			people.money -= taixFee;
			System.out.println("잔돈" + people.money +"입니다.");
			return taixFee;
		} else {
			System.out.println("돈이 없습니다. 경찰서 가겠습니다.");
			return 0;
		}
	}
}
