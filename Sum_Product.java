//1. Write a program to input two integers using parameters and find their sum and product.

import java.util.*;
class Sum_Product
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int a,b,Sum,Product;
		System.out.println("Enter the number a and b: ");
		a=sc.nextInt();
		b=sc.nextInt();
		Sum=a+b;
		Product=a*b;
		System.out.println("The Sum is: " + Sum);
		System.out.println("The Product is: " + Product);
	}
}