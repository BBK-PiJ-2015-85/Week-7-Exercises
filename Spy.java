public class Spy {
	
	private static int spyCount = 0;
	private int spyID;
	
	public Spy(int spyID) {
		spyCount++;
		this.spyID = spyID;
		System.out.println("Spy ID: " + spyID);
		System.out.println("Total number of spies: " + spyCount);
	}
	
	public static int getNumberOfSpies() {
		return spyCount;
	}
	
	public void die() {
		System.out.println("Spy " + spyID + " has been detected and eliminated.");
		spyCount--;
		System.out.println("There are " + spyCount + " spies remaining.");
	}
	
	public static void main(String[] args) {
		Spy spy1 = new Spy(1);
		Spy spy2 = new Spy(2);
		Spy spy3 = new Spy(3);
		spy1.die();
		Spy spy4 = new Spy(4);
		spy2.die();
		spy3.die();
		Spy spy5 = new Spy(5);
	}
	
}