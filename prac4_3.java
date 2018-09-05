import java.util.*;

abstract class shape
{
		double l,br;
		
		public void getdata()
		{
		Scanner b=new Scanner(System.in);
        System.out.println("Enter l and b:");
        l=b.nextDouble();
        br=b.nextDouble();
		}
		
		abstract void area();
		
		
		//abstract shape area(triangle s2);
		
		/*public void putdata()
		{
			System.out.println(a);
		}*/
}

class rectangle extends shape
{
		public void area()
		{
			System.out.println(l*br);	
		}
		
		
}
class triangle extends shape
{

		public void area()
		{
			System.out.println(0.5*l*br);
		}

}



class prac4_3
{
    public static void main(String a[])
    {
        shape s1=new rectangle();
        shape s2=new triangle();
        s1.getdata();
        s1.area();
        s2.getdata();
		s2.area();
	}
}
