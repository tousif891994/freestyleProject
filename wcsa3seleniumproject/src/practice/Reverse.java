package practice;

import java.util.Scanner;

public class Reverse {
	public static void main(String[] args)
	/*{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to reverse");
		int num=sc.nextInt();
		int reverse=0;
		for (int i = num; i!=0; i=i/10) 
		{
			int rem=i%10;
			reverse=reverse*10+rem;
			
		}
		System.out.println(reverse);
		
	}*/
	
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to reverse");
		int num=sc.nextInt();
		int reverse=0;
		for (int i = num; i!=0; i=i/10) 
		{
			int rem=i%10;
			reverse=reverse*10+rem;
			
		}
		
		if (reverse==num)
		{
			System.out.println(num+"=is a pallindrome");
		}
		else
		{
			System.out.println(num+"=is not pallindrome");
		}
	}
	
	

}
