import java.util.Scanner;
public class Lab4 {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int num1, num2, num3, num4, num5, max, min;
	
	System.out.print("PLease Enter the 1st Integer:");
	num1 = input.nextInt();
	System.out.print("PLease Enter the 2nd Integer:");
	num2 = input.nextInt();
	System.out.print("PLease Enter the 3rd Integer:");
	num3 = input.nextInt();
	System.out.print("PLease Enter the 4th Integer:");
	num4 = input.nextInt();
	System.out.print("PLease Enter the 5th Integer:");
	num5 = input.nextInt();
	
	max = (num1 > num2) ? num1 : num2;
	max = (num3 > max) ? num3 : max;
	max = (num4 > max) ? num4 : max;
	max = (num5 > max) ? num5 : max;
	
	min = (num1 < num2) ? num1 : num2;
	min = (num3 < min) ? num3 : min;
	min = (num4 < min) ? num4 : min;
	min = (num5 < min) ? num5 : min;
	
	System.out.printf("%nThe largest number in group is %d\nThe smallest number in" +
	" group is %d\n", max, min);
	}

}
