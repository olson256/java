import java.util.*;

class complex
{
		int real,image;

		/*void getdata()
		{
		Scanner b=new Scanner(System.in);
        System.out.println("Enter no.:");
        r=b.nextInt();
        i=b.nextInt();
		}
		void putdata()
		{
			System.out.println(r);
			System.out.println(i);
		}*/
	    complex()
	    {
			real=0;
			image=0;
		}
	    
		complex(int r,int i) 
		{
		real=r;
		image=i;
        }
		
		
		complex add(complex c1,complex c2)
		{
			complex c3=new complex();
			c3.real=c1.real+c2.real;
			c3.image=c1.image+c2.image;
			return c3;
		}


}
class prac3_2
{
    public static void main(String a[])
    {
		int i,r;
		Scanner b=new Scanner(System.in);
        System.out.println("Enter no.:");
        r=b.nextInt();
        i=b.nextInt();
        complex c1=new complex(r,i);
        complex c2=new complex(1,1);
        complex c3=new complex();
        c3=c3.add(c1,c2);
		System.out.println("Ans="+c3.real+"+"+c3.image+"i");
		//System.out.println(c3.image);
	}
}
