import java.util.Scanner;
public class Lab5 {

	public static void main(String[] args)
	{
	Scanner input = new Scanner(System.in);
	int num, num1;
	
	System.out.print("Please enter an integer:");
	num1 = input.nextInt();
	
	num = num1 % 3;
	if (num == 0)
	{System.out.print("\nThe number is divisible by 3.");
	} else {System.out.print("\nThe number is not divisible by 3.");}
	}
}
