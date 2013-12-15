package Collections;

import java.util.ArrayList;
import java.util.Stack;

public class StackOfPlates {
	StackOfPlates()
	{
		Stack<Integer>p=new Stack<Integer>();
		array.add(index,p);
	}
	 static int limit;
	 int index=0;
	 int stack =-1;
	 public void push(int platesize)
	 {
		 Stack<Integer> p;
		 if(stack==limit-1)
		 {
//			 System.out.println("index increase");
			 p=new Stack<Integer>();
			 p.push(platesize);
			index++; 
			stack=0;
		 }
		 else
		 {
			p= array.get(index);
			stack++;
			p.push(platesize);
			
		 }
		 array.add(index, p);
	 }
	 public int pop()
	 {
		 int size=-1;
		 Stack<Integer> p;
		 
		 if(stack==-1)
		 {
			 if(index==0)
			 {
				 System.out.println("no data");
				
						 
						 
		 }else{
			 index--;
			 stack=limit-1;
			 p=array.get(index);
				size=p.pop();
		 }}
			 else
			 {
				 p=array.get(index);
					size=p.pop();
					stack--;
			 }
			 
		 
		 
		 return size;
	 }
			 
	 ArrayList<Stack<Integer>> array =new ArrayList<Stack<Integer>>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		limit=5;
		StackOfPlates t=new StackOfPlates();
		t.push(15);
		t.push(25);
		t.push(35);
		t.push(45);
		t.push(55);
		t.push(65);
		t.push(75);
		t.push(85);
		t.push(95);
		t.push(105);
		System.out.println("plat size popedout is :");
	System.out.println(t.pop());
	System.out.println(t.pop());
	System.out.println(t.pop());
	System.out.println(t.pop());
	System.out.println(t.pop());
	System.out.println(t.pop());
	System.out.println(t.pop());
	System.out.println(t.pop());
	System.out.println(t.pop());
	System.out.println(t.pop());
//	System.out.println(t.pop());
//	System.out.println(t.pop());
//	System.out.println(t.pop());
//	System.out.println(t.pop());
//	System.out.println(t.pop());
	}

}
