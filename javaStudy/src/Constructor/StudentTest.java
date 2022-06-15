package Constructor;

public class StudentTest {
	
	public static void main(String[] args) {
		
		int studentAge = 10;
		
		Student st = new Student(studentAge);
		
		String info = st.showStudentInfo();
		
		System.out.println(info);
		
		
		Student st1 = new Student();
		
		System.out.println(st1.showStudentInfo());
		
	}


}
