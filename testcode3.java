import java.util.Scanner;
public class testcode3 {

	public static void main(String[] args) {
		// 3_11
		/*final double PI =3.1415926536;
		System.out.print("input the r : ");
		Scanner input = new Scanner(System.in);
		double r = input.nextDouble();
		
		System.out.printf("둘레 길이: %f\n", 2*r*PI);
		System.out.printf("넓이: %f", r*r*PI);*/
		final float size = 3.3058f;
		Scanner input = new Scanner(System.in);
		System.out.print("input the meter1 : ");
		double meter1 = input.nextDouble();
		System.out.print("input the meter2 : ");
		double meter2 = input.nextDouble();
		System.out.printf("Size of room : %f", meter1*meter2*size);
		
		
	}

}
