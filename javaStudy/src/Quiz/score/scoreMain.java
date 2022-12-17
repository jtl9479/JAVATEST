package Quiz.score;

import java.util.ArrayList;

public class scoreMain {

	public static void main(String[] args) {
		
		ArrayList<Student> student = new ArrayList<Student>();  
		
		
		student.add(new Student("1001", "lee"));
		student.add(new Student("1002", "kim"));
	

		for(Student s : student) {
			s.showInfo();
		}
	}
}
