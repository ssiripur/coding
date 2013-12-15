package Collections;

public class StudentExample implements Comparable<StudentExample>{
	int Sno;
	char[] name ;
	public StudentExample(int Sno,String n)
	{
		name=new char[n.length()];
//		System.out.println("I am called");
		name=n.toCharArray();
     this.Sno=Sno;
//     System.out.println(n.length());
//     for(int i=1;i<n.length()-1;i++)
//     {
//     this.name[i]=n.charAt(i);
//	}
	}
 public String toString()
 {
	String s=new String();
	s="\n"+"my employee Id is: "+Sno+"\n"+"my name is :"+new String(name)+"....................."+"\n";
	return s;
 }
@Override
public int compareTo(StudentExample o) {
	if(this.Sno>o.Sno)
	{
		return 1;
	}
	if(this.Sno==o.Sno)
	{
		return 0;
	}
	// TODO Auto-generated method stub
	return -1;
}

}
