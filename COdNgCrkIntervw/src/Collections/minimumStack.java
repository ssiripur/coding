package Collections;

import java.util.ArrayList;
import java.util.Stack;

public class minimumStack {

	/**
	 * @param args
	 */
	int minvalue=100;
	Stack<Integer> st=new Stack<Integer>();
	Stack<Integer> min=new Stack<Integer>();
	public void push(int value)
	{
		if(minvalue>value)
		{
			min.push(value);
			minvalue=value;
		}
		st.push(value);
	}
	public int pop( )
	{
		int k=-1;
		try
		{ k=st.pop();
			
		}
		catch(Exception e){
			return -1;
		}
		if(k==minvalue)
		{
		min.pop();
		minvalue=min.peek();
		}
	
		return k;
	}
	public int minvalue()
	{
		return minvalue;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		minimumStack t=new minimumStack();
		
		t.push(15);
		t.push(20);
		t.push(35);
		t.push(50);
		System.out.println(t.pop());
		System.out.println("min value of the stach is: "+t.minvalue());

	}

}
