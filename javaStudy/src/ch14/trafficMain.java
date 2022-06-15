package ch14;

public class trafficMain {
	
	public static void main(String[] args) {
		
		/*
		 * Student s = new Student("kim", 10000); Student s1 = new Student("kang",
		 * 1300); bus b = new bus("100");
		 * 
		 * s.bus(b); s.bus(b); s.studentChange();
		 * 
		 * s1.bus(b); s1.bus(b); s1.studentChange();
		 */
		taxi taxi = new taxi("택시입니다");
		
		people people = new people("kim", 10000);
		people.takeTaxi(taxi);

		people people1 = new people("kim", 10000);
		people1.takeTaxi(taxi);
		taxi.TaxiIncome();
	}

}
