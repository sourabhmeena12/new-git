import java.util.Scanner;
class n 
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enetr the radius of cylinder: ");
double r = sc.nextDouble();

System.out.println("Enter the height of the cylinder: ");
double h = sc.nextDouble();
double area = 2*3.14*r*h+2*3.14*r*r;
double vol = 3.14*r*r*h;
System.out.println("area of cylinder is :  "+area);
System.out.println("volume of cylinderis : "+vol);

}
}

