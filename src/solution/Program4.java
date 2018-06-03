package solution;

import java.util.ArrayList;

public class Program4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> o = new ArrayList<Integer>() ,e = new ArrayList<Integer>();
		for(int i=1;i<=30;i++)
		{
			System.out.println("5 x "+i+" = "+5*i);
			if((5*i)%2==0)
				e.add(5*i);
			else
				o.add(5*i);
		}
		System.out.print("The even results are ");
		for(int x:e)
			System.out.print(x+",");
		System.out.println();
		System.out.println("The count of even results is "+e.size());
		System.out.print("The odd results are ");
		for(int x:o)
			System.out.print(x+",");
		System.out.println();
		System.out.println("The count of odd results is "+o.size());
		
	}

}
