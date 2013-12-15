package Collections;

public class Node {
	Node n;int Data;
	public Node(Node n,int Data ) {
	this.n=n;
	this.Data=Data;
		// TODO Auto-generated constructor stub
	}
	//append add the new element
	void append(int d)
	{
		Node end=new Node(this,d);
	    Node n=this;
	    while(n.n!=null)
	    {
	    	n=n.n;
	    	
	    }
	    n.n=end;
	    n.n.n=null;
	}
	Node Delete(Node head,int data)
	{
		if(head.Data==data)
		{
		return head;}
		Node current=head;
		while(current.n!=null)
		{
		if(current.n.Data!=data)
		{
			current=current.n;
		}
		else
		{
			current.n=current.n.n;
			return current;
		}
		}
		return head;
	}

}
