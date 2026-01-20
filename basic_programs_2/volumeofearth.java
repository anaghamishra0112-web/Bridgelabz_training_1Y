import java.util.Scanner;
class volumeofearth
{
	public static void main(String[] args)
	{
		double kilo = 6378;
		double miles = kilo*0.6;
		System.out.println(miles);
		double r = miles;
		double volume_of_earth = 4/3*3.14*r*r*r;
		System.out.println(volume_of_earth);
	}
}