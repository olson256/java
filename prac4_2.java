import java.util.*;

class shape
{
		double a;
		
		public shape area(rectangle s1)
		{
			shape s3=new shape();
			s3.a=s1.l*s1.br;
			return s3;
		}
		
		public shape area(triangle s2)
		{
			shape s4=new shape();
			s4.a=0.5*(s2.l*s2.h);
			return s4;
		}
		
		public void putdata()
		{
			System.out.println(a);
		}
}

class rectangle extends shape
{
		double l,br;
		
		public void getdata()
		{
		Scanner b=new Scanner(System.in);
        System.out.println("Enter l and b:");
        l=b.nextDouble();
        br=b.nextDouble();
		}
		
}
class triangle extends shape
{
		double l,h;

		public void getdata1()
		{
		Scanner b=new Scanner(System.in);
        System.out.println("Enter l and h:");
        l=b.nextDouble();
        h=b.nextDouble();
		}
}



class prac4_2
{
    public static void main(String a[])
    {
        rectangle s1=new rectangle();
        shape s3=new rectangle();
        triangle s2=new triangle();
        shape s4=new triangle();
        s1.getdata();
        s3=s3.area(s1);
        s3.putdata();
        s2.getdata1();
        s4=s4.area(s2);
        s4.putdata();

	}
}
