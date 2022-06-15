package singleton;


public class Company {//싱글톤 하나의 인스턴스만 필요할 경우 
	
	private static Company instance = new Company();
	
	private Company() {
		
	}
	
	public static Company getInstance() {
		
		return instance;
	}

}
