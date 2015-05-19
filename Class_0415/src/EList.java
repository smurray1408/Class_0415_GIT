/**
 *   Maintains a linked list of any kind of objects. Called class EList because it is Elaine's implementation
 *   of a Linked List
 */
public class EList
{	private ListNode first;   	// A reference to the first node in the list

	/**
	 * Constructs an empty list
	 */
	public EList ()	
	{	first= null;
	}
	
	/**
	 *  Makes a new ListNode containing "d" and adds it at the start of list.
	 *  "d" can be any class of Object.
	 */
	public void add(Object d)
	{	ListNode temp;
		temp = new ListNode(d, first);
		first = temp;	
	}
	
	public void addToEnd(Object d) {
		if (first == null) {
			add(d);
		} else {
			addToEnd(d, first);
		}
	}
	
	private void addToEnd(Object d, ListNode first) {
		ListNode temp;
		if (first.getNext() == null) {
			temp = new ListNode(d);
			first.setNext(temp);
		} else {
			addToEnd(d,first.getNext());
		}
	}
	
	/**
	 * Inserts "o" at the beginning of the EList
	 */
	public void insertAtBeginning(Object o ) {
		//TBD
	}
	
    /**
	 * Returns true if "d" is contained in the list, false otherwise.
	 */
	public boolean contains(Object d)
	{	ListNode temp = first;
		boolean found = false;
		while (temp != null && !found)
		{	if (temp.getData().equals(d) )
				found = true;
			temp = temp.getNext(); // move along to next node in the list
		}
		return found;
	}
	
	public int length() {
		return length(first);
	}
	
	/**
	 *  Returns a string containing every node in List.
	 */
	public String toString()	
	{	ListNode temp = first;
		String value = "";
		while (temp != null)
		{	value = value + " " + temp.toString();
			temp = temp.getNext();
		}
		return value;
	}
	
	public int factorial(int n) {
		if (n == 0) {
			return 1;
		} else {
			return (n * factorial(n-1));
		}
	}
	
	public void countDown (int n) {
		if (n>=1) {
			System.out.print(n + " ");
			countDown(n-1);
		}
	}
	
	private int length (ListNode temp) {
		if (temp == null) {
			return 0;
		} else {
			return (1 + this.length(temp.getNext()));
		}
	}
	
	public ListNode getHead() {
		return first;
	}
}
