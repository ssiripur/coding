package Collections;

public class StringTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String t="anciwafcbisbf]uvsdibcz hvvic hzv c ijivcjsa zc iyzvcjs";
//System.out.println(t.length());
char[] a=t.toCharArray();
int t1=0;
//System.out.println(t1);
for(char k:a)
{
	if(k==' ')
	{
	t1+=2;	
	
	}
		t1++;
}

char[] newchar=new char[t1+1];
int index=0;
for(char k:a)
{
	if(k==' ')
	{
		newchar[index++]='%';
		newchar[index++]='2';
		newchar[index++]='0';
		
	}
	else newchar[index++]=k;
}
System.out.println(new String(newchar));
	
//new question
	String s1="aaabbbccggtthll";
	System.out.println(s1);
	StringBuffer b1=new StringBuffer();
	StringBuffer b2=new StringBuffer();
	int i=s1.length();
    int k=0,count=0;
   // System.out.println(i);
	while(k<=i-1)
	{	count=0;
		b1.append(s1.charAt(k));
		if(k==i-1)
		{
			break;
		}
	while(s1.charAt(k)==s1.charAt(k+1))
		{
			count++;
			k++;
			if(k==i-1)
			{
				break;
			}
		}
		b1.append(count+1);
		k++;
		}
	b1.append(count+1);
	char last=s1.charAt(0);
count=0;
	for( k=1;k<s1.length();k++)
	{
		if(s1.charAt(k)==last)
		{
		count++;	
		}
		else
		{
			
			b2.append(last);
			b2.append(count);
			last=s1.charAt(k);
			count=1;
		}
	}
	b2.append(last);
	b2.append(count);
	System.out.println(b1);	   
	System.out.println(b2);
//new question;
}}
