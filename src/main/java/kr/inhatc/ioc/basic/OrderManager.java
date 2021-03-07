package kr.inhatc.ioc.basic;

public class OrderManager {

	//private HyundaiMaker maker;
	private KiaMaker maker;

	public OrderManager() {
		super();
//		maker = new HyundaiMaker();	// 생성자를 통한 생성 (의존)
		maker = new KiaMaker();	// 생성자를 통한 생성 (강결합)
	}
	
	public void order() {
		// 돈 준비 
		Money money = new Money(1000);
		System.out.println("OrderManager.order : I made " + money.getAmount());
		System.out.println("OrderManager.order : I payed " + money.getAmount());
		
		// 차 구매 
		Car car = maker.sell(money);
		System.out.println("OrderManager.order : I received " + car.getName() );
	}
}
