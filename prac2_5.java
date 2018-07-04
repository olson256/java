import java.util.*;

class prac2_5
{
    public static void main(String a[])
    {
        Scanner b=new Scanner(System.in);
        String s=new String();
        System.out.println("Enter a line:");
        s=b.nextLine();
        int n=s.length();
        int j=0,m=n-1;
        for(int i=0;i<n/2;i++)
        {
			if(s.charAt(i)==s.charAt(m))
			{
				m--;
				//System.out.println("ajgasukgkasfgasuigf");
				j++;
				System.out.println(j);
			}
		}
		if(j==n/2) 
         {
        System.out.println("String is a palindrome");
		}
		else
		{
			System.out.println("String is not a palindrome");
		}
    }
}

