package solution;

import java.util.Scanner;

public class Program11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the Statement: ");
		String[] ip = s.nextLine().split(" ");
		String reverse="";
		System.out.print("Reversed Statement is: ");
		for(int i=ip.length-1;i>=0;i--)
		{
			reverse+=ip[i]+" ";
		}
		System.out.print(reverse);
	}
}
