package Constructor;

public class Student {

	public int studentAge = 9;
	public String studentName = "강륭강";
	public int grade = 1;
	
	
	public Student(int studentAge) {
		this.studentAge = studentAge;
	}
	public Student() {}
	
	public String showStudentInfo() {
		
		return studentAge + "살이고" + studentName + "이름 이며" + grade + "학년이다." ;
	}
}
