// ****************************************************************
//   QueueTest.java
//
//   A simple driver to manipulate a queue.
//          
// ****************************************************************
import java.lang.Iterable;

public class QueueTest
{

    public static void main(String[] args)
    {
	QueueADT queue = new LinkedQueue();

	//put some stuff in the queue: 0,2,4,..,14
	for (int i=0; i<8; i++) {
	    queue.enqueue(i*2);}
	System.out.println("\n\n** Initial queue **");
	printQueue(queue);

	//dequeue 4 items
	for (int i=0; i<4; i++) {
	    queue.dequeue();}
	System.out.println("\n\n** After dequeueing 4 items **");
	printQueue(queue);

	//enqueue 7 more: 1,2,..,7
	for (int i=0; i<7; i++) {
	    queue.enqueue(i+1);}
	System.out.println("\n\n** After enqueueing 7 more items **");
	printQueue(queue);

    }    


    //----------------------------------------------------------
    // Prints elements of queue, restoring it before returning
    //----------------------------------------------------------
    public static void printQueue(QueueADT queue)
    {
	//print everything in the queue, putting elements
	//back into the queue after printing

	int queueSize = queue.size();
	for (int i = 0; i < queueSize; i++)
	    {
		Object val = queue.dequeue();
		System.out.print (val  + " ");
		queue.enqueue(val);
	    }
	System.out.println();
    }
}

