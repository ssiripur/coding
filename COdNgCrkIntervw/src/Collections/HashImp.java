package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;

public class HashImp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long time2=System.nanoTime();
Map<Integer,StudentExample> t=new TreeMap<Integer,StudentExample>();
t.put(10,new StudentExample(10,"harry"));
t.put(20,new StudentExample(20,"harry1"));
t.put(15,new StudentExample(15,"raju"));
t.put(25,new StudentExample(25,"raju1"));
t.put(14,new StudentExample(14,"petter1"));
t.put(24,new StudentExample(24,"petter1"));
t.put(13,new StudentExample(13,"arun"));	
t.put(12,new StudentExample(12,"shobav"));
t.put(11,new StudentExample(11,"mary"));
Set<Integer> k1=new HashSet<Integer>();
k1=t.keySet();
Iterator<Integer> k = k1.iterator();
System.out.println("I am "+t.getClass());
Vector<StudentExample>v=new Vector<StudentExample>();
int i=0;
long time;
while(k.hasNext())
{	time=System.nanoTime();
	
	//System.out.println(k.next());
	//System.out.println(t.get(k.next()));
	//if((t.get(k.next())instanceof StudentExample))
           if(k.hasNext())
			{
		v.add(i,t.get(k.next()));
	    System.out.println(time);
        i++; 
            }
	time-=System.nanoTime();
	System.out.println(time);
}
Map<Integer,StudentExample> t1=new HashMap<Integer,StudentExample>(t);


for(StudentExample s:v)
{
	System.out.println("this is vector data::");
	System.out.println(s);
}
Set<Integer> k2=new HashSet<Integer>();
k2=t1.keySet();
Iterator<Integer> k3 = k2.iterator();
System.out.println("I am "+t.getClass());
while(k3.hasNext())
{
	//System.out.println(k.next());
	System.out.println(t.get(k3.next()));
}

System.out.println("data entered");
//System.out.println(t.toString());
//HashMap<Integer,StudentExample> h=new HashMap<Integer,StudentExample>(t);
//h.
	time2-=System.nanoTime();
	System.out.println(time2);
	//String time demo;
	String[] d1=new String[10];
	StringBuffer s1=new StringBuffer();
	long Time3=System.nanoTime();
	d1[0]=new String("hello");
	for(int i1=1;i1<10;i1++)
	{
		d1[i]=new String(d1[i-1]+"hello");
	}
	System.out.println(Time3-=System.nanoTime());
	Time3=System.nanoTime();
	for(i=0;i<10;i++)
	{
    s1=s1.append("HELLO");	
	}
	System.out.println("TIME TAKEN BY STRING BUFFER"+(Time3-=System.nanoTime()));
     char[] t9={'a','s','d','e','f','s','d','s','a'};
     Arrays.sort(t9);
     System.out.println(t9);
     String s12="hello";
     String s21="oehll";
     char[] a1,a2;
     a1=s12.toCharArray();
     a2=s21.toCharArray();
     Arrays.sort(a1);
     Arrays.sort(a2);
     for(i=0;i<a1.length;i++)
     {
    	if(a1[i]!=a2[i])
    	{
    		System.out.println("false");
    	}
     }
     System.out.println("true");
     
     
    		 
	 }}

