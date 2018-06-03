package solution;

import java.util.Scanner;

public class Program12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("Enter three integers (Space separated) to sort: ");
		String[] i = s.nextLine().split(" ");
		int[] a = new int[3];
		//System.out.println(i.length);
		a[0] = Integer.parseInt(i[0]);
		a[1] = Integer.parseInt(i[1]);
		a[2] = Integer.parseInt(i[2]);
		if(a[0]>a[1])
		{
			int x = a[0];
			a[0]=a[1];
			a[1] = x;
			if(a[0]>a[2])
			{
				x = a[0];
				a[0]=a[2];
				a[2] = x;
			}
			else if(a[1]>a[2])
			{
				x = a[1];
				a[1]=a[2];
				a[2] = x;
			}
		}
		else
		{
			if(a[0]>a[2])
			{
				int x = a[0];
				a[0]=a[2];
				a[2] = x;
			}
			else if(a[1]>a[2])
			{
				int x = a[1];
				a[1]=a[2];
				a[2] = x;
			}
		}
		System.out.print("Sorted Ascending Order is");
		for(int b:a)
			System.out.print(b+" ");
	}

}
