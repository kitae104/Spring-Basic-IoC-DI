package kr.inhatc.ioc.interfaces;

public class TestClient {

	public static void main(String[] args) {
		//CarMaker maker = new HyundaiMaker();
		CarMaker maker = new KiaMaker();
		
		OrderManager manager = new OrderManager();
		manager.setMaker(maker);
		manager.order();
	}
}
