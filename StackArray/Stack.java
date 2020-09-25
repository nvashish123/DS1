package StackArray;

public class Stack<Item> {

	private Item[] stack;
	private int numberOfItems;
	
	public Stack(){
		this.stack = ( Item[] ) new Object[1];
	}

	public void push(Item item){
		
		if( numberOfItems == this.stack.length ){
			resize(2*this.stack.length);
		}
		
		this.stack[numberOfItems++] = item;
	}
	
	public Item pop(){
		Item itemToPop = this.stack[--numberOfItems];
		
		if( numberOfItems > 0 && numberOfItems == this.stack.length/4 ){
			resize(this.stack.length/2);
		}
		
		this.stack[numberOfItems] = null;
		
		return itemToPop;
	}
	
	public Item peek(){
		int topItemIndex = numberOfItems - 1;
		Item itemToPop = this.stack[topItemIndex];
		return itemToPop;
	}
	
	public void traverse()
	{
		for(int i = 0;i<stack.length;i++)
		{
			System.out.print(stack[i]);
			System.out.print(",");
		}
		System.out.println("");
	}
	
	
	public boolean isEmpty(){
		return this.numberOfItems == 0;
	}
	
	public int size(){
		return this.numberOfItems;
	}

	// O(n)
	private void resize(int capacity) {
		
		Item[] stackCopy = ( Item[] ) new Object[capacity];
		
		for(int i=0;i<numberOfItems;i++){
			stackCopy[i]=this.stack[i];
		}
		
		this.stack = stackCopy;
	}
}
