package solution;

import java.util.Scanner;

public class Program7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the temperature array with space separation:");
		String[] ip = s.nextLine().split(" "); 
		float[] temp = new float[ip.length];
		int k=0;
		for(String i:ip)
		{
			temp[k]=Float.parseFloat(i);
			k++;
		}
		/*for(float t:temp)
			System.out.print(t+" ");*/
		for(int a=0;a<temp.length;a++)
		{
			for(int b=a+1;b<temp.length;b++)
			{
				if(temp[a]>temp[b])
				{
					float x= temp[a];
					temp[a] = temp[b];
					temp[b] = x;
				}
			}
		}
		
		/*for(float t:temp)
			System.out.print(t+" ");*/
		System.out.println("Maximum: "+temp[temp.length-1]);
		System.out.println("Minimum: "+temp[0]);
		
	}

}
