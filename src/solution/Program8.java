package solution;

import java.util.Scanner;

public class Program8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the number of rows to generate :");
		String a=s.next();
		int k = Integer.parseInt(a);
		int x=1;
		for(int i=2;i<=k+1;i++)
		{
			for(int j=1;j<i;j++)
			{
				System.out.print(x%2);
				x++;
			}
			System.out.println();
		}
	}

}
