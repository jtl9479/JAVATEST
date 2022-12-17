package Quiz.score;

public class Student {

	private String number;
	private String name;
	
	public Student(String number, String name) {
		this.number = number;
		this.name = name;
	}
	
	public void showInfo() {
		Subject subject;
		if (this.number.equals("1001") ) {
			subject = new Subject(100, 50);
		} else {
			subject = new Subject(70, 85, 100);
		}
		
		System.out.println("학번 : "  +number + ", 이름 : " + name + ", 총점 : " + subject.getSumScore());
	}
	
	
	
}
