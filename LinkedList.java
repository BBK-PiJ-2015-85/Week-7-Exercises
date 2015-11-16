public class LinkedList {
	private int value;
	private LinkedList next;
	private LinkedList head;
	
	public LinkedList(int value) {
		this.value = value;
		this.next = null;
	}
	
	public int getValue() {
		return value;
	}
	
	public void setNext(LinkedList next) {
		this.next = next;
	}
	
	public LinkedList getNext() {
		return next;
	}
}