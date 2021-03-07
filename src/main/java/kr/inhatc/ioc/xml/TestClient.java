package kr.inhatc.ioc.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestClient {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("car-config.xml");
		
		OrderManager manager = context.getBean("manager", OrderManager.class); // 클래스 이름으로 아이디
		System.out.println("manager : " + manager);
		
		manager.order();
		
		System.out.println("------------------------------------");
	}
}
