package prac;
import java.util.Scanner;


public class Palindrome {
	public static boolean palindromeCheck(int n) {
		int temp=n;
		int rev_num=0;
		while(temp>0) {
			int last_digit=temp%10;
			rev_num=(rev_num*10)+last_digit;
			temp/=10;
		}
		if(n==rev_num) {
			return true;
		}else {
			return false;
		}
		
	}
    public static boolean palindromeCheckString(String t) {
		int i =0,j=t.length()-1;
		while(i<j) {
			if(t.charAt(i)!=t.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("enter a number");
		int n=s.nextInt();
		String t=Integer.toString(n);
		if(palindromeCheckString(t)) {
			System.out.println("given number is palindrome");
		}else {
			System.out.println("given number is not palindrome");
		}
		

	}

}
