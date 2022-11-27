package com.bridgelabz.stackuc1;

public class Stack {
	int top;
	int max_size = 4;
	int array[] = new int[max_size];

	public void stackCreate(int element) {
		if(top == -1) {
			System.out.println("Satck is Empty");
		}
		else {
			top++;
			array[top] = element;
			System.out.println(element+" is inserted into the stack and top is: "+top);
		}
	}
	
	public void showStack() {
		System.out.println("Elements");
		for(int i=1;i<=top;i++) {
			System.out.println(array[i]);
		}
	}
	
	public static void main(String[] args) {
		Stack stack = new Stack();
		stack.stackCreate(56);
		stack.stackCreate(30);
		stack.stackCreate(70);
		stack.showStack();
	}
}
