package extend;

public class Parents {
	
	
	static String a;
	
	static int b = 0;
	static int b1 = 0;
	
	
	Parents() {
	}
	
	static {
		a = "눈누난나";
		b = 10;
	}
	
	public String hungry() {
		
		String s = a;
		
		return s;
	}
	
}

class test extends Son{
	
	int tt = 10;
	
	public void ttt() {
		System.out.println(son);
	}
	
	public void tttt() {
		ttt();
	}
}
