package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Trees {
	//Build a Tree from Array;
	int[] a;
	int index;
	public TreeNode BuildTree(int[] a)
	{
	 this.a=a;   
	 index=Math.abs((a.length)/2);
		if(a.length<1)
		{
			System.out.println("empty array");
			return null;
		}
		TreeNode root=new TreeNode(a[Math.abs((a.length)/2)]);
		System.out.println("rooot created with value:"+a[Math.abs((a.length)/2)]);
		if(a.length==1)
		{
			return root;
		}
//     TreeNode root=new TreeNode(null,null,a[(1+a.length)/2]);
		if(a.length==2)
		{
     lchild(0,Math.abs((a.length)/2)-1,root);
     return root;
		}
		lchild(0,Math.abs((a.length)/2)-1,root);
     rchild(Math.abs((a.length)/2)+1,a.length-1,root);
     return root;
	}
	public int rchild(int start,int end,TreeNode n)
	{
		if(index!=Math.abs((start+end)/2))
				{
		  n.rchild=new TreeNode(a[Math.abs((start+end)/2)]); 
		  System.out.println("rchild created with the value:"+a[Math.abs((start+end)/2)]+"rchild of"+n.data);
				}
		else
		{
			return 0;
		}
		if(start==end)
			{
	    	//  n.rchild=new TreeNode(null,null,a[start]); 
			return 0;
		     }
		if(start==end+1)
		{
			rchild(end,end,n.rchild);	
		}
		else
		{
			rchild(Math.abs((start+end)/2)+1,end,n.rchild);
			lchild(start,Math.abs((start+end)/2)-1,n.rchild);
		}
		return 0;
	}
	public int  lchild(int start,int end,TreeNode n)
	{  if(index!=Math.abs((start+end)/2))
	{
		n.lchild=new TreeNode(a[Math.abs((start+end)/2)]);
		System.out.println("lchild created with value:"+a[Math.abs((start+end)/2)]+"lchild of"+n.data);
		}
	else
	{
		return 0;
	}
	
	if(start==end)
	{
	//  n.rchild=new TreeNode(null,null,a[start]); 
	return 0;
     }
if(start==end+1)
{
	rchild(end,end,n.lchild);	
}
else
{
	rchild(Math.abs((start+end)/2)+1,end,n.lchild);
	lchild(start,Math.abs((start+end)/2)-1,n.lchild);
}
return 0;
		
		
	}
	//tsa
	private void BreadFirst(TreeNode n)
	{
     Tqueue q=new Tqueue();
     q.enqueue(n);
     n.visted=true;
     while(!q.isEmpty())
     {
     TreeNode t=q.dequeue();
    
     if((t.lchild.visted!=true)&&(t.lchild!=null))
     {
    	 System.out.println(t.lchild);
			q.enqueue(t.lchild); 
     }
     if((t.rchild.visted!=true)&&(t.rchild!=null))
     {
    	 System.out.println(t.rchild);
			q.enqueue(t.rchild); 
     }
     
     }
	}
	//inorder transversal.............................................................
	private void DepthFirst(TreeNode n)
	{
		
		if(n.lchild!=null)
		{
			DepthFirst(n.lchild);
		}
		System.out.println("node inspected is :"+n.data);
		if(n.rchild!=null)
		{
			DepthFirst(n.rchild);
		}
	}
	//Bfs using Java collections
	
	public void Bfs(TreeNode n)
	{
		java.util.Queue<TreeNode>q1=new LinkedList<TreeNode>();
		TreeNode t;
		if(n==null)
		{
			System.out.println("empty tree");
		}
		else
		{
		q1.offer(n)	;
		while(!q1.isEmpty())
		{
			t=q1.poll();
			System.out.println("Node inspected is:"+t);
			
			if(t.lchild!=null)
			{
				q1.offer(t.lchild);
			}
			if(t.rchild!=null)
			{
				q1.offer(t.rchild);
			}
		}
		System.out.println("--------------------BFS COMPLETED-----------------------");
		}
	}
	public boolean isBalanced(TreeNode n)
	{
		int t;
		System.out.println(isHeightBalanced(n));
		if(isHeightBalanced(n)==-1)
			{
			return false;
			}
		
		else return true;
		
	}
/////--------------------------without iterating without use---------------------------------
	public static int isHeightBalanced(TreeNode n)
	{
		int t1=0,t2=0;
		if(n.lchild!=null)
		{
			t1=isHeightBalanced(n.lchild);
		}
		if(n.rchild!=null)
		{
			t2=isHeightBalanced(n.rchild);
		}
		if(t1==-1||t2==-1||(Math.abs(t1-t2)>1))
		{
			return -1;
		}
		else return Math.max(t1, t2)+1;
	}
////////------------------ancestor question over------------------------------------------------
	public static int isfound(int key1,int key2,int found,TreeNode n)
	{
		int fl=0,fr=0,f=0;
		if(n.data==key1||n.data==key2)
		    f++;
		if(n.lchild!=null)
			fl=isfound(key1,key2,found,n.lchild);
		if(n.rchild!=null)
			fr=isfound(key1,key2,found,n.rchild);
        if(fl==1&&fr==1)
			System.out.println("the least common ancestor for this is nodes is:::"+n);
		return fl+fr+f;
	}
	//Dfs trail------------------------------------------------------------
	ArrayList<LinkedList<TreeNode>> array=new ArrayList<LinkedList<TreeNode>>();
    int count=0;
	public  void  TreeList(TreeNode n,int level)
	{
		LinkedList<TreeNode> t ;
		if(count<=level)
		{
			for(int i=count;i<=level;i++)
			{
				LinkedList<TreeNode>t1=new LinkedList<TreeNode>();
              array.add(i, t1);			
              
			}
			count=level;
		}
	    t = array.get(level);
		t.add(n);
		if(n.lchild!=null)
			TreeList(n.lchild,level+1);
		if(n.rchild!=null)
			TreeList(n.lchild,level+1);
		array.set(level, t);
	
	}
	public void print()
	{
		for(int i=0;i<array.size();i++)
		{
			LinkedList<TreeNode> level=new LinkedList<TreeNode>();
			TreeNode l;
			System.out.println("list printing of level  :"+i);
			Iterator iter=level.listIterator();
			while(iter.hasNext())
			{
				System.out.println(iter.next());
			}
		}
		
		
	}
static //	int count1=0,count2=0;
	boolean flag=false;
	
	//most effective implementation would if the value is true stop calling.....q
	private void DepthFirst1(TreeNode n,int value)
	{
		
		if(n.lchild!=null)
		{
			DepthFirst1(n.lchild,value);
		}
		//count1++;
		
		//System.out.println("given data is :"+value+"with count+ "+count2);}
		if(flag)
		{
			System.out.println("the next node of the node given valueis :"+n.data);
			//System.out.println("printing count of the given data would be"+count1);
			flag=false;
		}
		if(n.data==value){flag=true;}
		//System.out.println("node inspected is :"+n.data);
		if(n.rchild!=null)
		{
			DepthFirst1(n.rchild,value);
		}
	}
	
	/////////check whether the tree is subset of other
	 TreeNode n6=new TreeNode();
	private  void  find(TreeNode n,int value)
	{

		
		if(n.lchild!=null)
		{
			find(n.lchild,value);
		}
		if(n.data==value)
		{
			n6=n;
			flag=true;
		}
		if(n.rchild!=null)
		{
			find(n.rchild,value);
		}
	
		
		//return n1;
	}
	private void isSubtree(TreeNode n1,TreeNode n2)
	{
		flag=false;
		this.find(n1,n2.data);
		if(flag==true)
		{
			System.out.println("");
			DepthFirst2( n2, this.n6);
			if(flag==false)
			{
				System.out.println("n2 is not a subtree of the intial node");
			}
		}
		else
		{
        System.out.println(" not a subtree");
		}
		if(flag=true)
		{
			System.out.println("it is a subtreee");
		}
		
	}
	
	private void DepthFirst2(TreeNode n,TreeNode n2)
	{
		//System.out.println("this is dfs2");
		if(flag!=false)
		{
			if(n.data!=n2.data)
			{
				flag=false;
				System.out.println("not a subtree");
			}
		if((n.lchild!=null&&n2.lchild!=null))
		{
		
			DepthFirst2(n.lchild,n2.lchild);
			
		}
		else if(n.lchild==n2.lchild){}
		else
		{
			System.out.println("wrong branching");
			flag=false;
		}
		if(n.rchild!=null &&n2.rchild!=null)
		{
			DepthFirst2(n.rchild,n2.rchild);
		}

		else if(n.rchild==n2.rchild){}
		//if((n.rchild!=null && n2.rchild==null)||(n.rchild==null && n2.rchild!=null))
		else {
			System.out.println("wrong branching");
			flag=false;
			}
			}
		
	}
	//Sum paths
	int FullSum=19;
	public void SumPath(TreeNode Root,int Sum,TreeNode n)
	{
		if(Sum==n.data)
		{
			System.out.println("the route is between"+Root.data+"and"+n.data );
		}
		SumPath(n,FullSum,n);
		Sum-=n.data;
		if(n.lchild!=null)
		{
		SumPath(Root,Sum,n.lchild);}
		else
		{
			System.out.println("no path");
		}
		if((n.rchild!=null))
		{
		SumPath(Root,Sum,n.rchild);}
		else
		{
			System.out.println("no path");
		}
		
		
	}
	
	
	public static void main(String[] args)
	{
		int[] a={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
		int[] b={9,10,11,12,13,14};
		int[] c={12,13,14};
		Trees t=new Trees();
		
		TreeNode root=t.BuildTree(a);
		System.out.println("--------new Tree formed with the following index-----------");
		TreeNode root2=t.BuildTree(b);
		System.out.println("--------new Tree formed with the following index-----------");
		TreeNode root3=t.BuildTree(c);
		System.out.println("---------------DFS-------------------------------");
		t.DepthFirst(root);
		System.out.println("---------------BFS-------------------------------");
		
		t.Bfs(root);
		System.out.println("--------first question is balanced -----------------");
		System.out.println(t.isBalanced(root));
		System.out.println("------ancestor and route between twonode in a tree---------");
		System.out.println(t.isfound(3, 7, 0, root));
		System.out.println("------ancestor and route between twonode in a tree**ended---------");
		System.out.println("------LevelLinked under process ---------------");
		t.TreeList(root, 0);
		t.print();
		
		System.out.println("---------------------finding next node_________________");
        t.DepthFirst1(root,10 );
        t.DepthFirst1(root,12);
        System.out.println("---------------issubtree function call check------------");
        t.isSubtree(root, root2);
        System.out.println("---------------issubtree function call check------------");
        t.isSubtree(root, root3);
        System.out.println("----------------sum path printing-----------------------");
        t.SumPath(root, 19, root);
	
	}

}
