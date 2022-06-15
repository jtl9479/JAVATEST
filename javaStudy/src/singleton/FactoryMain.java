package singleton;

public class FactoryMain {

	public static void main(String[] args) {
		
		
		Factory factory1 = Factory.getInstance();
		Factory factory2 = Factory.getInstance();
		Factory factory3 = Factory.getInstance();
		factory1.createGood();
		factory2.createGood();
		factory2.createGood();
		factory3.createGood();

		System.out.println(Factory.goodsNumber());
	} 
}
