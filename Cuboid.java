//4. Write a program to input the length, breadth and height of a cuboid and find its Volume //and Total Surface Area.

import java.util.*;
class Cuboid
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int Length,Breadth,Height,Volume,TSA;
		System.out.println("Enter the values: ");
		Length=sc.nextInt();
		Breadth=sc.nextInt();
		Height=sc.nextInt();
		Volume=Length*Breadth*Height;
		TSA=2*(Length*Breadth+Breadth*Height+Height*Length);
		System.out.println("Volume of Cuboid is: " + Volume);
		System.out.println("Total Surface Area of Cuboid is: " + TSA);
	}
}