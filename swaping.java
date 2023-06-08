import java.util.Scanner;
class n 
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enetr a addition: ");
int a = sc.nextInt();

System.out.println("Enter a second: ");
int b = sc.nextInt();
System.out.println("Before swaping A = "+a+"b = "+b);
int temp = a;
a = b;
b = temp;
System.out.println("After swaping A = "+a+"b = "+b);


}
}

