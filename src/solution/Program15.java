package solution;

import java.util.Scanner;

public class Program15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int a= Integer.parseInt(s.next());
		System.out.print("The factors are: ");
		while(a>1)
		{
		for(int x=2;x<=a;x++)
		{
			if(a%x==0)
			{
				System.out.print(x+" ");
				a = a/x;
				break;
			}
		}
		}
	}

}
