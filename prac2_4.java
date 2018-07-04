import java.util.*;

class prac2_4
{
    public static void main(String a[])
    {
        Scanner b=new Scanner(System.in);
        String s=new String();
        System.out.println("Enter a line:");
        s=b.nextLine();
        int ct=0;
         if(s.charAt(0)>=65 && s.charAt(0)<=90)
			{
                ct++;
            }
        for(int i=1;i<s.length();i++)
        {
            if(s.charAt(i)==' ')
			{
                i++;
                 if(s.charAt(i)>=65 && s.charAt(i)<=90)
			{
                ct++;
            }
                
            }
		}
        System.out.println("total  number of words start with capital letters are :"+ct);
    }
}

