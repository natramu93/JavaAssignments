package solution;

import java.util.Scanner;

public class Program9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the number: ");
		String ip = s.next();
		int k,n = Integer.parseInt(ip);
		k=n;
		//System.out.println(n);
		System.out.print("Enter the number to search: ");
		ip = s.next();
		int count = 0;
		int x=Integer.parseInt(ip);
		while(n>0)
		{
			if(x==n%10)
				count++;
			n = n/10;
		}
		System.out.println("Number of occurance of "+x+" in "+k+" is: "+count);
	}

}
