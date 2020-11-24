package Project;

public class Permanet extends Employee{

	int pay;
	int bonus;
	
	
	public Permanet() {
		
	}
	
	public Permanet(int a1, int a2) {
		this.pay = a1;
		this.bonus = a2;
	}
	
	@Override
	void getPay() {
		System.out.println("급여 ==> " + (pay+bonus));
	}
	
	
	
	
	
	
	
	
	
	
	
}
