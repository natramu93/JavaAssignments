package solution;

import java.util.ArrayList;

public class Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> e , o;
		e = new ArrayList<Integer>();
		o = new ArrayList<Integer>();
		int i=0;
		while(i<=30)
		{
			if(i%2==0)
			{
				System.out.println(i+" is even");
			}
			else
			{
				System.out.println(i+" is odd");
			}
			i++;
		}
		
		/*ArrayList<Integer> e , o;
		e = new ArrayList<Integer>();
		o = new ArrayList<Integer>();
		int i=0;
		while(i<=30)
		{
			if(i%2==0)
			{
				e.add(i);
			}
			else
			{
				o.add(i);
			}
			i++;
		}
		System.out.print("Even numbers are: ");
		for(int k:e)
			System.out.print(k+",");
		System.out.println();
		System.out.print("Odd numbers are: ");
		for(int k:o)
			System.out.print(k+",");*/

	}

}
