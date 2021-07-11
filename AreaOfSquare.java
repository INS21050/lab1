package basic;

import java.util.Scanner;

public class AreaOfSquare {
	public static void main(String[] args) {
		System.out.println("enter the value of side:");
		Scanner alt=new Scanner(System.in);
		double side=alt.nextDouble();
		double area=side*side;
		System.out.println("the area of the square is:"+area);
	}

}
