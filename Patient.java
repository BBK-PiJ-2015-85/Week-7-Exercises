public class Patient {
	private String name;
	private int age;
	private String illness;
	private Patient next;
	private Patient previous;
	
	public Patient(String name, int age, String illness){
		this.name = name;
		this.age = age;
		this.illness = illness;
		this.next = null;
		this.previous = null;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getIllness() {
		return illness;
	}
	
	public Patient getNext(){
		return next;
	}
	
	public Patient getPrevious() {
		return previous;
	}
	
	public void setNext(Patient next) {
		this.next = next;
	}
	
	public void setPrevious(Patient previous) {
		this.previous = previous;
	}
}