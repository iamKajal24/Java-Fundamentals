import java.util.LinkedList;
import java.util.Queue;

public class QueueExam {

    public static void main(String[] args) {
        
        Queue<String> queue = new LinkedList<>();

        // add method-> adds an element to the queue
        queue.add("kajal");
        queue.add("shubham");
        queue.add("khushi");
        queue.add("riya");
        queue.offer("Shivansh"); // adds an element to the queue, returns true if successful, false otherwise
        System.out.println("queue : " + queue);

        //element method-> returns the head of the queue without removing it, throws NoSuchElementException if the queue is empty
        System.out.println("element : " + queue.element());

        //peek method-> returns the head of the queue without removing it, returns null if the queue is empty
        System.out.println("peek : " + queue.peek());

        //poll method-> retrieves and removes the head of the queue, returns null if the queue is empty
        System.out.println("poll : " + queue.poll());
        System.out.println("after poll : " + queue);

        


    }
    
}
