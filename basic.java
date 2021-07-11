package basic;

import java.util.Scanner;

public class basic {
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter value of a:");
		int a=scan.nextInt();
		System.out.println("enter value of b;");
		int b=scan.nextInt();
		int sum=a+b;
		System.out.println("the sum is..:"+sum);
	}

}
