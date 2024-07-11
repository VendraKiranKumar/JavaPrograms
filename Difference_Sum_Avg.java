//3. Write a program to input three integers and find the difference between their sum and //their average.

import java.util.*;
class Difference_Sum_Avg
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int a,b,c,Sum;
		float Avg,Diff;
		System.out.println("Enter the three Number: ");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		Sum=a+b+c;
		Avg=Sum/3.0f;
		Diff=Sum-Avg;
		System.out.println("The Sum is: " + Sum);
		System.out.println("The Avg is: " + Avg);
		System.out.println("The Difference is: " + Diff);
	}
}