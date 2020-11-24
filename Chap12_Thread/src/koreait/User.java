package koreait;

public class User extends Thread {
	
	ATM atm;
	
	public User() { }
	
	public User(ATM atm, String name) {
		super(name);
		this.atm = atm;
	}
	
	@Override
	public void run() {
		// ATM 멤버(입금, 출금) 메서드 호출
		this.atm.deposit(20000);  // 입금 메서드
		this.atm.withdraw(30000); // 출금 메서드
		
	}



	

}
