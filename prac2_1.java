import java.util.*;
class prac2_1
{
	public static void main(String[] a)
	{
	int b[]=new int[a.length];
	int i,l;
	l=b.length;
	for(i=0 ; i<a.length ; i++ )
	{
	b[i]=Integer.parseInt(a[i]);
	}
	System.out.println("String before sorting");
	for(i=0;i<l;i++)
	{
	System.out.println(b[i]);
    }
	Arrays.sort(b);
	System.out.println("String after sorting");
	for(i=0;i<l;i++)
	{
	System.out.println(b[i]);
    }
	}
}
