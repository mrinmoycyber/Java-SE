package com.exceptionChallenge;

public class Stack {
	
	private int size;
	private int top=-1;
	private int S[];
	
	// declaring a constructor and taking the size of the stack
	public Stack(int sz) {
		
		size=sz;  // setting the size
		S=new int[sz];  // creating an array of that size
		
	}
	
	public void push(int x) throws StackOverFlow{
		
		if (top==-1)
			throw new StackOverFlow();  // throw a object of StackOverFlow
		top++;
		S[top]=x;  // assign the value
		
	}

	public int pop() throws StackUnderFlow {  // return deleted value
		
		int x=-1;
		
		 if(top==-1)  // we can't delete
			 throw new StackUnderFlow();
		x=S[top];
		top--;   // decrement the top 
		return x;
		
		}
}
