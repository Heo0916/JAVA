package Project;

public abstract class Employee {
	
	String name;
	
	
	
	public String getName(){
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	abstract void getPay();
	

}
