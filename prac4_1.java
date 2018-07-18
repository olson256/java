import java.util.*;

class player
{
		int a;
		String n;

		public void getdata()
		{
		Scanner b=new Scanner(System.in);
        System.out.println("Enter name and age:");
        n=b.nextLine();
        a=b.nextInt();
		}
		public void putdata()
		{
			System.out.println(n);
			System.out.println(a);
		}
}

class cricketplayer extends player
{
		int m;

		public void getdata1()
		{
		Scanner b=new Scanner(System.in);
        System.out.println("Enter total matches played:");
        m=b.nextInt();
        //r=b.nextInt();
		}
		public void putdata1()
		{
			System.out.println(m);
			//System.out.println(r);
		}
}
class batsman extends cricketplayer
{
		int r;

		public void getdata2()
		{
		Scanner b=new Scanner(System.in);
        System.out.println("Enter total runs:");
        r=b.nextInt();
		}
		
		public void putdata2()
		{
			System.out.println(r);
		}
}

class bowler extends cricketplayer 
{
		int w;

		public void getdata3()
		{
		Scanner b=new Scanner(System.in);
        System.out.println("Enter total wickets:");
        w=b.nextInt();
		}
		public void putdata3()
		{
			System.out.println(w);
		}
}


class prac4_1
{
    public static void main(String a[])
    {
        bowler p1=new bowler();
        batsman p2=new batsman();
        p1.getdata();
        p1.putdata();
        p1.getdata1();
        p1.putdata1();
        p2.getdata2();
        p2.putdata2();
        p1.getdata3();
        p1.putdata3();

	}
}
