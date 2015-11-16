public class ListUtilities {
	private LinkedList start = null;
	
	public ListUtilities() {
		this.start = null;
	}
		
	public void addElement(int value) {
		LinkedList newElement = new LinkedList(value);
		if (this.start == null) {
			this.start = newElement;
		} else {
			LinkedList current = start;
			while (current.getNext() != null) {
				current = current.getNext();
			}
			current.setNext(newElement);
		}		
	}
	
	public void printList() {
		LinkedList current = start;
		if (current == null) {
			System.out.println("The list is empty.");
		}
		while (current != null) {
			System.out.println(current.getValue());
			current = current.getNext();
		}
	}
	
	public void array2list(int[] array) {
		for (int i = 0; i < array.length; i++) {
			addElement(array[i]);
		}
	}
	
	public void launch() {
		int[] myArray = {1, 2, 3};
		array2list(myArray);
		printList();
	}
	
	public static void main(String[] args) {
		ListUtilities list = new ListUtilities();
		list.launch();
	}
}