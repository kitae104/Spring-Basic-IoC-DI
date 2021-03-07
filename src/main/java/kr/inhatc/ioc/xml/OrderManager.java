package kr.inhatc.ioc.xml;

public class OrderManager {

	//private HyundaiMaker maker;
	//private KiaMaker maker;
	private CarMaker maker;

	public OrderManager(CarMaker maker) {
		super();
		this.maker = maker;
	}
	
	// Setter 추가 <- 주입하는 방식으로 대체 
	public void setMaker(CarMaker maker) {
		this.maker = maker;
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
