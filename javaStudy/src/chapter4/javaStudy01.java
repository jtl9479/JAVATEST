package chapter4;

import java.util.Calendar;

public class javaStudy01 {

	static int count = 0;

	javaStudy01(){
		
		this.count++;
		System.out.println(this.count);
		
		
	}
	
	
	public static void main(String[] asd) {//메인메소드 하나의 쌍
		
		javaStudy01 test1 = new javaStudy01();
		javaStudy01 test2 = new javaStudy01();
		
		
		week today1 = week.test1;
		week today2 = week.test2;
		
		String today = today1.name();
		
		System.out.println(today);
		System.out.println(today1.compareTo(today2));
		
	} 
}

