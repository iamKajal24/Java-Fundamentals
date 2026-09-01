import java.util.Stack;

public class StackExam {

    public static void main(String[] args) {
        
        Stack<Integer> stack = new Stack<>();

        // push method-> adds an element to the top of the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(50);

        System.out.println("stack : " + stack);

        // pop method-> removes and returns the top element of the stack
        System.out.println("pop : " + stack.pop());
        System.out.println("after pop : " + stack);

        //peek method-> returns the top element of the stack without removing it
        System.out.println("peek : " + stack.peek());
        System.out.println("after peek : " + stack);

        // search method-> returns the position of the element in the stack
        System.out.println("search : " + stack.search(20));

        //empty method-> returns true if the stack is empty, false otherwise
        System.out.println("is empty : " + stack.empty());

        // size method-> returns the number of elements in the stack
        System.out.println("size : " + stack.size());

        // contains method-> returns true if the stack contains the specified element, false otherwise
        System.out.println("contains : " + stack.contains(30));

        // clear method-> removes all elements from the stack
        stack.clear();
        System.out.println("after clear : " + stack);

    }
    
}
