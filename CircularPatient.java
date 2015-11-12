public class CircularPatient {
	private String name;
	private int age;
	private CircularPatient nextPatient;
	
	
	public CircularPatient(String name, int age) {
		this.name = name;
		this.age = age;
		this.nextPatient = this;		
	}
	
	public void addPatient(CircularPatient newPatient) {
		CircularPatient start = this;
		if (this.nextPatient == this) {
			this.nextPatient = newPatient;
			newPatient.nextPatient = this;
		} else {
			for (CircularPatient p = this.nextPatient; p != start; p = p.nextPatient) {
				if (p.nextPatient == start) {
					p.nextPatient = newPatient;
					newPatient.nextPatient = this;
				}
			}			
		}
	}
	
	public void printList() {
		System.out.println("Patient name: " + this.name + ". Patient age: " + this.age + ".");
		CircularPatient start = this;		
		for (CircularPatient p = this.nextPatient; p != start; p = p.nextPatient) {
			System.out.println("Patient name: " + p.name + ". Patient age: " + p.age + ".");
		}
	}
	
	public void deletePatient(String patientName) {
		CircularPatient start = this;
		for (CircularPatient p = this.nextPatient; p != start; p = p.nextPatient){
			if (p.nextPatient == start) {
				System.out.println("Patient " + patientName + " not found.");
				break;
			} else if (p.nextPatient.name.equals(patientName)) {
				p.nextPatient = p.nextPatient.nextPatient;
				System.out.println(patientName + " has been deleted.");
				break;
			} else if (start.nextPatient.name.equals(patientName)) {
				start.nextPatient = start.nextPatient.nextPatient;
				System.out.println(patientName + " has been deleted.");
				return;
			}
		}
	}
}