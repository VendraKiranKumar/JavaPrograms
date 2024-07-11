//2. Write a program to input five integers and find their average.

import java.util.*;
class Avg
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int a,b,c,d,e;
		float Avg;
		System.out.println("Enter the five integers: ");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		d=sc.nextInt();
		e=sc.nextInt();
		Avg=(a+b+c+d+e)/5.0f;
		System.out.println("The Average is: " + Avg);
	}
}