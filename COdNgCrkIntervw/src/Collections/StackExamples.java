package Collections;

import java.util.ArrayList;

public class StackExamples {
	ArrayList<Integer> s=new ArrayList<Integer>();
	int[] intArray={-1,-1,-1};
	/**
	 * @param args
	 */
	int count=0;
	public void ThreestackPush(int num,int element)
	{
		intArray[num]++;
		System.out.println("printing xcount:"+count);
		if((intArray[num]*3+num)>count)
		{
			for(int i=count+1;i<intArray[num]*3+num;i++)
			{
				s.add(i, 0);
				System.out.println("over riding location"+i);
			}
			count=intArray[num]*3+num;
		}
	       System.out.println("index pushing is"+(intArray[num]*3+num));
		s.add((intArray[num]*3+num), element);
	
	
	}
	public void print()
	{
		for(int j=0;j<count+1;j++)
		{
		System.out.println(	s.get(j));
		}
	}
	public int  ThreeStackPop(int num)
	{
		int num1=-1;
		if(intArray[num]!=-1)
		{
			System.out.println("index popping is:"+(intArray[num]*3+num));
			num1=s.get((intArray[num]*3+num));
			intArray[num]--;
		}
		else
		{
			System.out.println("no data to print");
		}
		
		return num1;
	}
	public int peek(int num)
	{
		int num1=-1;
		if(intArray[num]!=-1)
		{
			num1=s.get((intArray[num]*3+num));
			//intArray[num]--;
			
		}
		else
		{
			System.out.println("no data to print");
		}
		
		return num1;	
	}
	public boolean isEmpty(int num)
	{
		boolean flag;
		if(intArray[num]==-1)
		{
			flag=true;
		}
		else
		{
			flag=false;
		}
		return flag;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
StackExamples s=new StackExamples();
s.ThreestackPush(0, 15);
s.ThreestackPush(0, 20);
s.print();
s.ThreestackPush(1, 25);
s.ThreestackPush(1, 30);
s.print();
s.ThreestackPush(2, 35);
s.ThreestackPush(2, 40);
s.print();
System.out.println("data peeked is:"+s.peek(1));
System.out.println("data poped is :"+s.ThreeStackPop(1));
System.out.println("data peeked is:"+s.peek(1));
System.out.println("data poped is :"+s.ThreeStackPop(1));
System.out.println("data peeked is:"+s.peek(0));
System.out.println("data poped is :"+s.ThreeStackPop(0));
System.out.println("data peeked is:"+s.peek(0));
System.out.println("data poped is :"+s.ThreeStackPop(0));
System.out.println("data peeked is:"+s.peek(2));
System.out.println("data poped is :"+s.ThreeStackPop(2));
System.out.println("data peeked is:"+s.peek(2));
System.out.println("data poped is :"+s.ThreeStackPop(2));



	}

}
