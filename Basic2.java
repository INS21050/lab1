package basic;

import java.util.Scanner;

public class Basic2 {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("enter a value:");
		int i=scan.nextInt();
		System.out.println("enter another value:");
		int j=scan.nextInt();
		int mul=i*j;
		System.out.println("the product is:"+mul);
	}

}
