package solution;

import java.util.Scanner;

public class Program13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("Enter Number :");
		int x = Integer.parseInt(s.next());
		System.out.print("The number abundant numbers till "+x+" are: ");
		for(int n=1;n<=x;n++)
		{
		//System.out.print("Proper Devisors of "+n+" are: ");
		int sum=0;
		for(int i=1;i<=n/2;i++)
			if(n%i==0)
			{
				//System.out.print(i+" ");
				sum+=i;
			}
		//System.out.println();
		if(sum>n)
			System.out.print(n+" ");
		}
	}

}
