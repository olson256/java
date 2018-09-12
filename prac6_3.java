import java.util.*;

class InvalidEmailAddressException extends Exception{
	InvalidEmailAddressException (String message){
		super(message);
	}
}

class InvalidTelephoneNumberException extends Exception{
	InvalidTelephoneNumberException (String m){
		super(m);
	}
}

class Employee{
	String email,phn;
	void getdata()
	{
		System.out.print("Enter email id and phone number: ");
		Scanner sc=new Scanner(System.in);
		email=sc.nextLine();
		phn=sc.nextLine();
	}
	void putdata()
	{
			if(phn.length()>10)
			{
				try
				{
					throw new InvalidTelephoneNumberException("invalid phone number");
				}
				catch(InvalidTelephoneNumberException e)
				{
					System.out.println(e);
				}
			}
			if(!email.contains("@") || !email.contains("."))
			{
				try
				{
					throw new InvalidEmailAddressException("invalid email");
				}
				catch(InvalidEmailAddressException e)
				{
					System.out.println(e);
				}
			}
			System.out.println("Number: "+phn);
			System.out.println("Email Id: "+email); 
	}
}

class unit6_3{
	public static void main(String a[])
	{
		Employee e = new Employee();
		e.getdata();
		e.putdata();
	}
}
