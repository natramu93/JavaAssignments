package solution;

import java.util.Scanner;

public class Program10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the Length of the rectangle: ");
		int l = Integer.parseInt(s.next());
		System.out.print("Enter the width of the rectangle: ");
		int w = Integer.parseInt(s.next());
		for(int a=0;a<l;a++)
			System.out.print("*");
		System.out.println();
		for(int b=1;b<w-1;b++)
		{
		System.out.print("*");
		for(int a=1;a<l-1;a++)
		{
			System.out.print(" ");
		}
		System.out.println("*");
		}
		for(int a=0;a<l;a++)
			System.out.print("*");
	}

}
