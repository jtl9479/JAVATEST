package singleton;

public class Factory {

	//싱글톤 생성자 private 
	private static int factoeyGoodsNumber = 10001;
	
	private static Factory instance = new Factory();
	
	private Factory() {
	}
	
	public static Factory getInstance() {
		return instance;
	}
	
	public void createGood() {
		Factory.factoeyGoodsNumber++;
	}
	
	public static int goodsNumber() {
		return Factory.factoeyGoodsNumber;
	}
}
