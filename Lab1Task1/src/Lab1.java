import java.util.Scanner;
public class Lab1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num1, num2, sum, mul, sub;
		float div;                           // Promote the accuracy of the division calculation.
		
		System.out.print("Please Enter the 1st Integer:");
		num1 = input.nextInt();
		System.out.print("Please Enter the 2nd Integer:");
		num2 = input.nextInt();
		
		sum = num1 + num2;
		mul = num1 * num2;
		sub = num1 - num2;
		div =(float)num1 / (float)num2;
		
		System.out.printf("%nThe Sum is %d\nThe Product is %d\nThe Difference is %d\nThe Division is %.2f\n", sum, mul, sub, div);
		
	}

}
