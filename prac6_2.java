import java.util.*;
class prac6_2
{
	public static void main(String a[])
	{
	//int b[]=Interger.parseInt(a[i]);
	int avg=0;
	int i,l,n;
	l=a.length;
	int div,n1,n2;
	
	for(i=0;i<l;i++)
	{
		System.out.println(a[i]);
    }
    
	try
	{
		if(l==2)
		{
			n=Integer.parseInt(a[1]);
			if(n==0)
			{
				throw new ArithmeticException(n+"=0");
			}
				n1=Integer.parseInt(a[0]);
				n2=Integer.parseInt(a[1]);
				div=n1/n2;
				System.out.println(div);
		}
		
		if(l==1)
		{
		
		try
		{
			throw new ArithmeticException();
		}
		catch(ArithmeticException e)
		{
			System.out.println("ONLY ONE ARUGUMENT");
		}
		
		}
	}
	
	catch(ArithmeticException e)
	{
		System.out.println("divide by 0 error");
	}
	}

}
