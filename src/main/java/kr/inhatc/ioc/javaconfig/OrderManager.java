package kr.inhatc.ioc.javaconfig;

public class OrderManager {
	
	private CarMaker maker;

	public OrderManager(CarMaker maker) { 
		super();
		this.maker = maker;
		System.out.println("OrderManager() called");;
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
	
	public void init() {
		// 객체가 빈으로 등록된 다음에 초기화 작업을 위한 메소드 
		System.out.println("OrderManager.init() called 1");
	}
}
