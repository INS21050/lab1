package basic;

import java.util.Scanner;

public class OddorEven {
	public static void main(String[] args) {
		System.out.println("enter a number");
		Scanner all=new Scanner(System.in);
		int a=all.nextInt();
		if(a%2==0)
			System.out.println("the number is even");
		else
			System.out.println("the number is odd");
	}

}
