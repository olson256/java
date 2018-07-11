import java.util.*;

class prac2_6
{
    public static void main(String c[])
    {
        Scanner b=new Scanner(System.in);
        String s;
        System.out.println("Enter a line:");
        s=b.nextLine();
        int n=s.length();
        int a=0,e=0,i=0,o=0,u=0,t=0,j;
        while(s.compareTo("quit")!=0)
        {
			n=s.length();
			a=0;e=0;i=0;o=0;u=0;t=0;
			for(j=0;j<n;j++)
			{
				if(s.charAt(j)=='a' || s.charAt(j)=='A')
				{
					a++;
					t++;
				}
				if(s.charAt(j)=='e' || s.charAt(j)=='E')
				{
					e++;
					t++;
				}
				if(s.charAt(j)=='i' || s.charAt(j)=='I')
				{
					i++;
					t++;
				}
				if(s.charAt(j)=='o' || s.charAt(j)=='O')
				{
					o++;
					t++;
				}
				if(s.charAt(j)=='u' || s.charAt(j)=='U')
				{
					u++;
					t++;
				}
			}
		System.out.println("total="+t);
		System.out.println("a="+a);
		System.out.println("e="+e);
		System.out.println("i="+i);
		System.out.println("o="+o);
		System.out.println("u="+u);
		System.out.println("Enter a String or enter 'quit' to exit:");
        s=b.nextLine();
		}
		
    }
}

