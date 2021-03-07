package kr.inhatc.ioc.interfaces;

public class OrderManager {

	//private HyundaiMaker maker;
	//private KiaMaker maker;
	private CarMaker maker;

//	public OrderManager(CarMaker maker) {
//		super();
//		// 실제 구현체를 직접 넣는 경우는 불편 
////		maker = new HyundaiMaker();	// 생성자를 통한 생성 (의존)
////		maker = new KiaMaker();	// 생성자를 통한 생성 (강결합)
//		this.maker = maker;
//	}
	
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
