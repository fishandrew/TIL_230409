import java.util.Scanner;
public class testcode2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int number1;
		int number2;
		
		System.out.print("Enter first integer: ");
		number1 = input.nextInt();
		
		System.out.print("Enter second integer: ");
		number2 = input.nextInt();
		int sum = number1+ number2;
		System.out.printf("Sum is %o in octal, %d in decimal, %x in hexadecimal",sum,number1 + number2, sum);
		
		input.close();
	}

}
