package kr.inhatc.ioc.javaconfig;

public class HyundaiMaker implements CarMaker{
	
	@Override
	public Car sell(Money money) {
		System.out.println("HyundaiMaker.sell : I got " + money.getAmount());
		
		Car car = new Car("sonata");
		System.out.println("HyundaiMaker.sell : I made " + car.getName());
		System.out.println("HyundaiMaker.sell : I sold " + car.getName());
		
		return car;
	}
}
