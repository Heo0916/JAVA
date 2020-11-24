package koreait;

/*
 * [ATM 클래스 설계서]
 * - 입금과 출금의 은행거래가 가능한 ATM 클래스 설계.
 * - 계좌잔액 : private int balance;
 * - 생성자 : 계좌잔액(balance) 초기화.
 * - deposit() : 외부클래스(public)에서 입금하는 메서드.
 *   예) balance = balance + money;  // 잔액에 입금액을 더함.
 *   출력문 : OO,OOO원을 입금하여 OO,OOO원 남음
 * - withdraw() : 외부클래스(public)에서 출금하는 메서드.
 *   예) balance = balance - money;  // 잔액에서 출금액 차감.
 *   출력문 : OO,OOO원을 출금하여 OO,OOO원 남음.
 *   (단, balance < money 인 경우 "잔액이 부족합니다." 메세지 출력  
 */
public class ATM {
	
	private int balance;  // 계좌 잔액 멤버
	
	public ATM() { }
	
	public ATM(int balance) {  // 계좌 잔액 초기화 시키는 생성자
		this.balance = balance;
		}
	
	// 입금을 하는 메서드.
	public synchronized void deposit(int money) {
		balance += money;     // balance = balance + money
		System.out.println
		(Thread.currentThread().getName()+" 님이 " + money + 
				"원을 입금하여 + " + balance + " 원이 남았습니다. ");
	}
	
	// 출금을 하는 메서드
	public synchronized void withdraw(int money) {
		if(money > balance) { // 출금액이 잔액보다 큰 경우
			System.out.println("잔액이 부족합니다.~~~");
			return;      // 현재 메서드 실행 종료
		}
		balance -= money;   // balance = balance - money;
		System.out.println
		(Thread.currentThread().getName()+" 님이 " + money + 
				"원을 출금하여 + " + balance + " 원이 남았습니다. ");
	}

}
