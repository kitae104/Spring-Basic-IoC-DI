package kr.inhatc.ioc.annotation;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Named
public class TestClient {

	@Autowired
	private OrderManager orderManager; 
	
	public static void main(String[] args) {
//		//CarMaker maker = new HyundaiMaker();
//		CarMaker maker = new KiaMaker();
//		
//		OrderManager manager = new OrderManager();
//		manager.setMaker(maker);
//		manager.order();
		
		ApplicationContext context = new ClassPathXmlApplicationContext("car-config-annotation.xml");
		
		OrderManager manager = context.getBean("orderManager", OrderManager.class); // 클래스 이름으로 아이디
		System.out.println("manager : " + manager);
		
		manager.order();
		
		System.out.println("------------------------------------");
		
		TestClient testClient = context.getBean("testClient", TestClient.class);
		testClient.orderManager.order();
		
		System.out.println("------------------------------------");
		// 싱글톤 - 하나의 객체만 생성한다. 
		System.out.println(manager);
		System.out.println(testClient.orderManager);
		System.out.println(context.getBean("orderManager", OrderManager.class));
	}
}
