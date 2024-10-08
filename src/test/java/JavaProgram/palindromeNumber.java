package JavaProgram;

import java.util.Scanner;

public class palindromeNumber {

	public static void main(String[] args) {
		// 151
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the num: ");
		int num = sc.nextInt();
		int temp = num;
		int rem = 0 , sum = 0;
		while(num>0)
		{
			sum = (sum*10)+num%10;
			rem = sum+rem;
			num = num/10;
		}
		if(temp==sum)
			System.out.println("The given num is palindorme");
		else
			System.out.println("The given num is not palindorme");
	}
}
