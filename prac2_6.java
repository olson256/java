import java.util.*;

class prac2_
{
    public static void main(String a[])
    {
        Scanner b=new Scanner(System.in);
        String s,s1;
        System.out.println("Enter a line:");
        s=b.nextLine();
        int n=s.length();
        int a,e,i,o,u,t;
        while(s.compareTO("quit")==s1)
        {
			for(int i=0;i<n;i++)
			{
				if(s.charAt(i)=='a' || s.charAt(i)=='A')
				{
					a++;
					t++;
				}
				if(s.charAt(i)=='e' || s.charAt(i)=='E')
				{
					e++;
					t++;
				}
				if(s.charAt(i)=='i' || s.charAt(i)=='I')
				{
					i++;
					t++;
				}
				if(s.charAt(i)=='o' || s.charAt(i)=='O')
				{
					o++;
					t++;
				}
				if(s.charAt(i)=='u' || s.charAt(i)=='U')
				{
					u++;
					t++;
				}
			}
		System.out.println("Enter a quit to quit:");
        s1=b.nextLine();
		}
		System.out.println("total="+t);
		System.out.println("a="+a);
		System.out.println("e="+e);
		System.out.println("i="+i);
		System.out.println("o="+o);
		System.out.println("u="+u);
    }
}

