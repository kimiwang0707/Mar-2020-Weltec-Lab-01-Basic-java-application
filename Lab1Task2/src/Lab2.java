import java.util.Scanner;
public class Lab2 {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		int num1, num2;
		
		System.out.print("Please Enter the 1st Integer:");
		num1 = input.nextInt();
		System.out.print("Please Enter the 2nd Integer:");
		num2 = input.nextInt();
		
		if (num1 > num2)
		{System.out.printf("%n%d is larger.", num1);}
		if (num2 > num1)
		{System.out.printf("%n%d is larger.", num2);}
		if (num1 == num2)
		{System.out.print("\nThese numbers are equal.");}

	}

}
