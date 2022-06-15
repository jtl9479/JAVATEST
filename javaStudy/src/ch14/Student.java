package ch14;

public class Student {

	private String studentName;
	private int studentMoney;
	
	public Student(String studentName,int studentMoney ) {
		this.studentName = studentName;
		this.studentMoney = studentMoney;
	}
	
	public void bus(bus bus) {
		int change = this.studentMoney;
		if (studentMoney > bus.getBusFee()) {
			bus.takeBus(bus.getBusFee());
			change -= bus.getBusFee();
		} else {
			bus.errorBus();
		}
		
		this.studentMoney = change ;
	}
	
	public void studentChange() {
		System.out.println(studentName + "학생의 잔액은" + studentMoney +"원 입니다");
	}
	
}
