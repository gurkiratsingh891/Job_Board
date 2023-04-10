public class Stack {

	private char[] stackArray;
	private int last = -1;  //Position of last/top element of stack
	private int size;

	// Constructor to initialize the stack
	public Stack(int size)
	{
		this.size = size;
		// Initializing the stackArray
		stackArray = new char[size];
	}

	public void push(char ch)
	{
		// Checking if stackArray is full
		if (last + 1 == size) {
			System.out.println("Stack is full");
		}
		else {
			last = last + 1;
			stackArray[last] = ch;
		}
	}
	
	public char pop()
	{
		// If stack is empty
		if (last == -1) {
			System.out.println("No elements to pop");
			return '\0' ;
		}

		char removedChar = stackArray[last];
		last --;
		return removedChar;
	}

}
