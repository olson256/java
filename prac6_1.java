import java.util.*;
class prac6_1
{
	public static void main(String a[])
	{
	//int b[]=Interger.parseInt(a[i]);
	int avg=0;
	int i,l,n;
	l=a.length;
	System.out.println("Marks:");
	
	for(i=0;i<l;i++)
	{
		System.out.println(a[i]);
    }
    
	try
	{
		
		System.out.println("Average marks:");
		for(i=0;i<l;i++)
		{
			n=Integer.parseInt(a[i]);
			if(n>100)
			{
				throw new ArithmeticException(n+">100");
			}
			avg=n+avg;
		}
		System.out.println(avg/5);
	}
	
	catch(NumberFormatException e)
	{
		System.out.println("not a int");
	}
	
	catch(ArithmeticException e)
	{
		System.out.println("greater than 100");
	}
	}

}
