package StackArray;

public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Stack<String> stack = new Stack<>();
		
		stack.push("Adam");
		stack.push("Joe");
		stack.push("Mike");
		stack.push("Frank");
		stack.push("John");
		
		stack.traverse();
		
		System.out.println(stack.pop());

		stack.traverse();
		
		System.out.println(stack.peek());
		
		stack.traverse();
		
	}

}
