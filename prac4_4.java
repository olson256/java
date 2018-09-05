import java.util.*;

interface shape
{
    double pi=3.14;
    public void read();
    public void show();
}

class rectangle implements shape
{
		double l,br;
		
		public void read()
		{
			Scanner b=new Scanner(System.in);
			System.out.println("Enter l and b:");
			l=b.nextDouble();
			br=b.nextDouble();
		}
		
		public void show()
		{
			System.out.println(l*br);	
		}
		
}
class circle implements shape
{
		double r;
		
		public void read()
		{
			Scanner b=new Scanner(System.in);
			System.out.println("Enter r:");
			r=b.nextDouble();
		}
		
		public void show()
		{
			System.out.println(pi*r*r);
		}
}



class prac4_4
{
    public static void main(String a[])
    {
        rectangle s1=new rectangle();
        circle s2=new circle();
        s1.read();
        s1.show();
        s2.read();
		s2.show();
	}
}
