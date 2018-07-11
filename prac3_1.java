import java.util.*;

class student
{
		int roll;
		String name,add,branch;
		
		void getdata()
		{
		Scanner b=new Scanner(System.in);
        System.out.println("Enter name, address,branch and roll no.:");
        name=b.nextLine();
        add=b.nextLine();
        branch=b.nextLine();
        roll=b.nextInt();
		}
		
		void putdata()
		{
			System.out.println(name);
			System.out.println(add);
			System.out.println(branch);
			System.out.println(roll);
		}    
		
    
}
class prac3_1
{
    public static void main(String a[])
    {
		student s1=new student();
		s1.getdata();
		s1.putdata();
	}
}
