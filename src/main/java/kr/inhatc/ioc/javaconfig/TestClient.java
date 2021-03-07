package kr.inhatc.ioc.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestClient {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(CarConfig.class);
		
		OrderManager manager = context.getBean("orderManager", OrderManager.class); // 클래스 이름으로 아이디
		System.out.println("manager : " + manager);
		
		manager.order();
		
		System.out.println("------------------------------------");
		
		// Singleton
		System.out.println(manager == context.getBean("orderManager", OrderManager.class));
		
		System.out.println("------------------------------------");
		
		System.out.println(context.getBean("hyundai", HyundaiMaker.class));
		
		// @Bean에서 id 생략시 메소드 명으로 id를 처리함 
		System.out.println(context.getBean("kiaMotors", KiaMaker.class));
	}
}
