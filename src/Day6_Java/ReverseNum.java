package Day6_Java;

import java.util.Scanner;

public class ReverseNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,r;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter any number");
		n=s.nextInt();
		
		while(n>0)
		{
			r=n%10;
			System.out.print(r);
			n=n/10;
		
		}
	}

}
