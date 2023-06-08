import java.util.*;
class Test
{
	public static void main(String args[])
	{
		Test ob=new Test();
		ob.addition();
	}
	public void addition(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr a addition: ");
		int a = sc.nextInt();

		System.out.println("Enter a second: ");
		int b = sc.nextInt();
		int c = a+b;
		System.out.println("Addition="+c);
	}
}

