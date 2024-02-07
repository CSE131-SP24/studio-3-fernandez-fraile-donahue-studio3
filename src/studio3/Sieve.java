package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("What number are you going up to?");
		int n = in.nextInt();
		int[] allNum = new int[n+1];
		for (int n2 = 0; n2 <= n; n2++)
		{ 
			for (n2 % 2 != 0 && n2 % 3 != 0 && n2 % 5 != 0)
			{
				System.out.println(n2);
			}
			
		}
		
	}

}
