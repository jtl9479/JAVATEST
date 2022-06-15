package Student;

public class Student {

	private int StudentAge = 0;
	private String StudentName = null;
	
	
	public void StudentSys() {
		System.out.println("asd");
	}
	
	public Student() {
		
	}
	
	public String getStudentName() {
		return StudentName;
	}
	
	public void setStudentName(String StudentName) {
		this.StudentName = StudentName;
	}

	public int getStudentAge() {
		return StudentAge; 
	}
	
	public void setStudentAge(int StudentAge) {
		this.StudentAge = StudentAge;
	}
}
