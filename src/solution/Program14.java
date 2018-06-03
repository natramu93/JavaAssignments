package solution;

import java.util.Scanner;

public class Program14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the minimum value: ");
		int min = Integer.parseInt(s.next());
		System.out.print("Enter the maximum value: ");
		int max = Integer.parseInt(s.next());
		int count=0;
		for(int i=min;i<=max;i++)
		{
		int	n=i;
		//int n=100;
		while(n>0)
		{
			if(n%10==1)
				count++;
			n=n/10;
		}
		}
		System.out.println("The total number of 1s in the range is: "+count);
	}

}
