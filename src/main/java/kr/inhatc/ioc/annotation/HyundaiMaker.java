package kr.inhatc.ioc.annotation;

import org.springframework.stereotype.Component;

/* XML로 설정할 경우 
 * <bean id="hyundai" class="kr.inhatc.ioc.annotation.HyundaiMaker" /> 
 */

@Component("hyundai")
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
