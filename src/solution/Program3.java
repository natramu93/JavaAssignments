package solution;

public class Program3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int o,e;
		e=0;o=0;
		for(int i=0;i<=50;i++)
		{
			if(i%2==0)
				e += i;
			else
				o+=i;
		}
		if(e%2==0)
			System.out.println("Sum of even numbers from 0 to 50 is "+e+" and the sum is even");
		else
			System.out.println("Sum of even numbers from 0 to 50 is "+e+" and the sum is odd");
		if(o%2==0)
			System.out.println("Sum of odd numbers from 0 to 50 is "+o+" and the sum is even");
		else
			System.out.println("Sum of odd numbers from 0 to 50 is "+o+" and the sum is odd");
	}

}
