package solution;

import java.util.Scanner;

public class Program6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("Enter Value of N:");
		String n = s.next();
		System.out.print("Enter Value of M:");
		String m = s.next();
		int N = Integer.parseInt(n);
		int M = Integer.parseInt(m);
		for(int i=N-1;i>=N-M;i--)
			System.out.print(i+" ");
	}

}
