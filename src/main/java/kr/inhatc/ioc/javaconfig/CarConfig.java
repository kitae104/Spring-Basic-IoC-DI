package kr.inhatc.ioc.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
// 스캔을 통해서 CarConfig 클래스를 빈으로 등록하기 위해서는 @Component 설정이 필요 
@Component
public class CarConfig {
	
	// 빈 id를 지정해서 사용
	@Bean(name = "hyundai")
	public CarMaker hyundaiMaker() {
		CarMaker maker = new HyundaiMaker();
		return maker;
	}
	
	// id를 생략하면 메소드 명으로 id를 처리한다. 
	@Bean
	public CarMaker kiaMotors() {
		CarMaker maker = new KiaMaker();
		return maker;
	}
	
	// @PostConstruct 어노테이션 사용 가능 
	@Bean(initMethod = "init")
	public OrderManager orderManager() {
		OrderManager manager = new OrderManager(kiaMotors());
		return manager;
	}
}
