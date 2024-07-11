//5. Write a program to input three integers and find the product of the last digit of the //numbers.

import java.util.*;
class LastDigitProduct
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int a,b,c,Product;
		System.out.println("Enter the Numbers: ");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		int x=a%10;
		int y=b%10;
		int z=c%10;
		System.out.println("x is: " + x);
		System.out.println("y is: "+ y);
		System.out.println("z is: "+ z);
		Product=x*y*z;
		System.out.println("The Product is: "+Product);
	}
}