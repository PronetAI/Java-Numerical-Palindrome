import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    int num=sc.nextInt();
	    int digit;
	    int sum=0;
	    int palindrome=num;
	    int reverse=0;
	    while(num>0)
	    {
	    digit=num%10;
	    reverse=reverse*10+digit;
	    num=num/10;
	    }
	    if (reverse==palindrome) {
	    	System.out.println(reverse + " is an palindrome");}
		else {
			System.out.println(palindrome + " is not an palindrome");}

	}

}
