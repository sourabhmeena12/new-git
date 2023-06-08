import java.util.Scanner;
class n 
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter your principle: ");
float a = sc.nextFloat();
System.out.println("ENter your rate: ");
float b = sc.nextFloat();
float x = a*(1+b/100);
float CI = x-a;
System.out.println("circle of ference : "+CI);

}
}
 
