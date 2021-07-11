package basic;

import java.util.Scanner;

public class ArrayInput {
	public static void main(String[] args) {
		Scanner ull=new Scanner(System.in);
		int[] arr=new int[10];
		int sum=0;
		for(int i=0;i<10;i++)
		{
			arr[i]=ull.nextInt();
		}
		for(int num:arr)
		{
			sum=sum+num;
		}
		System.out.println("the sum of the array is="+sum);
	}

}
