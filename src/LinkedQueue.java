public class LinkedQueue implements QueueADT {

	Node front, rear;
	private int size = 0;

	public LinkedQueue() {
		this.front = this.rear = null;
	}

	// Method to add an key to the queue.
	public void enqueue(Object item) {

		// Create a new LL node
		Node temp = new Node(item);

		// If queue is empty, then new node is front and rear both
		if (this.rear == null) {
			this.front = this.rear = temp;
			return;
		}

		// Add the new node at the end of queue and change rear
		rear.next = temp;
		this.rear = temp;
	}

	// Method to remove an key from queue.
	public Object dequeue() {
		// If queue is empty, return NULL.
		if (isEmpty() == true) {
			return null;
		}
		// Store previous front and move front one node ahead
		Node temp = this.front;
		this.front = this.front.next;
		// If front becomes NULL, then change rear also as NULL
		if (isEmpty() == true) {
			this.rear = null;
		
	}
		return temp.getElement();
	}

	public boolean isEmpty() {

		// ------------------------------------------------
		// Returns true if queue is full.
		// ------------------------------------------------

		if (this.front == null)

		{
			Node temp = this.front;
			this.front = this.front.next;
			return true;
		} else {
			return false;
		}
	}

	public boolean isFull() { //a Linked Queue cannot be full
			return false;
		}

	public int size() {
			// ------------------------------------------------
		// Returns the number of elements in the queue.
		// ------------------------------------------------
		Node temp = this.front; 
        int count = 0; 
        while (temp != null) 
        { 
            count++; 
            temp = temp.next; 
        } 
        return count; 

	}

}