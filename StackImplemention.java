package slidingWindow;

public class StackImplemention {

	public static void main(String[] args) {
		MyStack myStack = new MyStack(5);
		myStack.push(10);
		myStack.push(30);
		myStack.push(40);
		myStack.push(50);
		myStack.push(70);
		myStack.push(80);
		
		myStack.printStack();
	}

}

class MyStack {
	private int maxSize;
	private int[] stackArray;
	private int top;
	
	public MyStack(int size) {
		maxSize=size;
		stackArray= new int[maxSize];
		top=-1; // empty stack
		
	}
	
	
	public void printStack() {
   if(isEmpty()) {
	   System.out.println("Stack is empty");
	   return ;
   }
   
   System.out.println(" Stack ")  ;
   for(int i=0;i<=top;i++) {
	   System.out.print("   "+stackArray[i]);
   }
   System.out.println("       ");
	}


	public void push(int value) {
		if(isFull()) {
			System.out.println("  Stack is full "+value);
	        return;
		}
		stackArray[++top]=value;
	}

public int pop() {
	if(isEmpty()) {
		System.out.println("  Stack is empty   ");
		return -1;
	}
	return stackArray[--top];
}

public boolean isFull() {
	return  (top == maxSize-1);
}

public boolean isEmpty() {
	return (top==-1);
}


}
