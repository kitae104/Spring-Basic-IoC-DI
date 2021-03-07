package kr.inhatc.ioc.javaconfig;

// 돈을 얼마나 갖고 있는지를 관리하는 클래스
public class Money {
	
	private int amount;

	public Money() {
		super();
	}

	public Money(int amount) {
		super();
		this.amount = amount;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}
	
}
