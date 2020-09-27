import java.util.Scanner;
public class Lab6 {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	double num0, rate, num1, num2, num3, num4, num5;
	
	System.out.print("Please enter the current world populaton:");
	num0 = input.nextDouble();
	System.out.print("Please enter the world population growth rate: %");   // growth rate normally is expressed with percentage "%"
	rate = input.nextDouble();
	
	num1 = num0 * (1 + rate / 100);
	num2 = num1 * (1 + rate / 100);
	num3 = num2 * (1 + rate / 100);
	num4 = num3 * (1 + rate / 100);
	num5 = num4 * (1 + rate / 100);

	System.out.printf("%nThe estimated world population\nafter 1 year is %.0f\nafter 2 years" +
	" is %.0f\nafter 3 years is %.0f\nafter 4 years is %.0f\nafter 5 years is %.0f\n", num1,
	num2, num3, num4, num5);
		
	}

}
