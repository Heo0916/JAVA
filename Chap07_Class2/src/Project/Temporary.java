package Project;

public class Temporary extends Employee {

	int time;
	int pay;
	
	public Temporary() {
		
	}
	
	public Temporary(int a1, int a2) {
		this.pay = a1;
		this.time = a2;
	}
	
	@Override
	void getPay() {
		System.out.println("급여 계산 ==> " + (time*pay));
	}
}
