import java.util.Scanner;
public class Lab3 {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int num1, num2, num3, sum, avg, mul, min, max;
	
	System.out.print("Please Enter the 1st Integer:");
	num1 = input.nextInt();
	System.out.print("Please Enter the 2nd Integer:");
	num2 = input.nextInt();
	System.out.print("Please Enter the 3rd Integer:");
	num3 = input.nextInt();
	
	sum = num1 + num2 + num3;
	avg = sum / 3;
	mul = num1 * num2 * num3;
	
	min = (num1 < num2) ? num1 : num2;
	min = (num3 < min) ? num3 : min;
	max = (num1 > num2) ? num1 : num2;
	max = (num3 > max) ? num3 : max;
	
	System.out.printf("%nThe Sum is %d\nThe Average is %d\nThe Product is %d\n" +
	"The Smallest Number is %d\nThe Largest Number is %d\n", sum, avg, mul, min, max);

	}

}
