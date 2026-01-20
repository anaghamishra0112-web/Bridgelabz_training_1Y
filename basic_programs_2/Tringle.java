import java.util.Scanner;
public class Traingle
{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.print("enter base and height:");
double base = sc.nextInt();
double height = sc.nextInt();
double Area;
Area = (1/2)*base*height;
System.out.println(Area);
double feet = height/30.43;
System.out.println("feet is :" +feet);
double inches = (1/12)*feet;
System.out.print("inches is :" +inches);
}
}