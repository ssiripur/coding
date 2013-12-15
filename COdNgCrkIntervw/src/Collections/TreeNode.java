package Collections;

public class TreeNode {
TreeNode lchild=null,rchild=null;
int data;
boolean visted=false;
	public TreeNode(int data) {
		// TODO Auto-generated constructor stub
//		this.lchild=lchild;
//		this.rchild=rchild;
		this.data=data;
			}
	public TreeNode() {
		// TODO Auto-generated constructor stub
	}
   public String toString()
   {
	   String s=new String();
	   s=""+this.data;
	  return s; 
   }
}
