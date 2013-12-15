package Collections;

public class Queue {

	/**
	 * @param args
	 */
	Qnode last=null;
	Qnode First=null;
	
	public void enqueue(int data)
	{
		if(last.next==null)
		{
			last.next=new Qnode(data);
			last.next.next=null;
			First.next=last.next;
			}
		else
		{
			last.next.next=new Qnode(data);
			last.next=last.next.next;
			}
	}
	public int dequeue()
	{
		int data;
		if(First.next!=null)
		{
		data=First.next.data;
		First.next=First.next.next;
		if(First.next==null)
		{
		last.next=First.next;
		}
		return data;
		}
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
