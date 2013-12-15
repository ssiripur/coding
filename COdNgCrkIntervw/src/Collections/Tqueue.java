package Collections;

public class Tqueue {
	/**
	 * @param args
	 */
	Qtnode last=null;
	Qtnode First=null;
	
	public void enqueue(TreeNode data)
	{
		if(last.next==null)
		{
			last.next=new Qtnode(data);
			last.next.next=null;
			First.next=last.next;
			}
		else
		{
			last.next.next=new Qtnode(data);
			last.next=last.next.next;
			}
	}
	public TreeNode dequeue()
	{
		TreeNode data;
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
		return null;
	}
	public boolean isEmpty()
	{
		if(First==null)
		{
			return true;
		}
		else return false;
			
	}


}
