package kr.inhatc.ioc.javaconfig;

// 자동자의 종류를 관리하는 클래스 
public class Car {
	private String name;

	public Car() {
		super();
	}

	public Car(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
