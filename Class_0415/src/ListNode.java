/**
 * One object of this class represents one Node in a Linked List. One Node
 * consists of a reference to any Object and a reference to the next node in the
 * list.
 */
class ListNode { /* package access */
	private Object data;       // Holds whatever data is in each node
	private ListNode next; // Holds the reference to the next node
										// in the List
	
	/**
	 * Returns the data from the ListNode
	 */
	Object getData() {  /* package access */
		return data;
	}

    /**
     * sets the data in the ListNode equal to "newData"
    */
	void setData (Object newData) { /* package access */ 
		data = newData;
	}
	
	/**
	 * Returns the reference to ListNode object that is the next one after this
	 */
	ListNode getNext() {  /* package access */ 
		return next;
	}

    /** 
     * Sets this ListNode to point to newNext 
     */
	void setNext (ListNode newNext) {   /* package access */ 
		next = newNext;
	}
	
	/**
	 * Constructs a new ListNode object that refers to "d". "d" can be any class
	 * of Object
	 */
	public ListNode(Object d) {
		data = d;
		next = null;
	}

	/**
	 * Constructs a new ListNode object that refers to "d" as its data and
	 * refers to "n" as its next one in the List.
	 */
	public ListNode(Object d, ListNode n) {
		data = d;
		next = n;
	}

	/**
	 * returns the data in this ListNode, in String format
	 */
	public String toString() {
		return data.toString();
	}
}
