package solution;

import java.util.Scanner;

public class Program5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the limit: ");
		String limit = s.next();
		int l = Integer.parseInt(limit);
		System.out.print("1");
		int sum=1;
		for(int i=3;i<=l;i=i+2)
		{
			System.out.print(" + "+i);
			sum += i;
		}
			System.out.print(" = "+sum);
	}

}
