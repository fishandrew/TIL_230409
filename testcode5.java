import java.util.Scanner;

public class testcode5 {

	public static void main(String[] args) {
		/*Scanner scanner = new Scanner(System.in);
		
		System.out.print("enter a and b and r: ");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		double r = scanner.nextDouble();
		System.out.print("enter x and y : ");
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		
		double l = Math.sqrt(Math.pow((a-x),2)+Math.pow(b-y,2));
		if (l <=r ) {
			System.out.printf("(%d, %d) isn inside the circle.", x,y);
		}
		else
		System.out.printf("(%d, %d) isnt inside the circle.", x,y);
	*/
		
	/*Scanner scanner = new Scanner(System.in);
	System.out.println("enter the month (1~12): ");
	int mon = scanner.nextInt();
	String m_n="invalid input.";
	if (mon>=3 && mon <=5)
		m_n = "spring";
	else if (mon >=6 && mon <=8)
		m_n= "summer";
	else if (mon>=9 && mon<=11)
		m_n= "fall";
	else if(mon==12 || mon==1 || mon==2)
		m_n = "winter";
	
	System.out.printf("%s", m_n);
	*/
	

		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the month (1~12): ");
		int mon = scanner.nextInt();
		String m_n;
		switch (mon) {
		case 3:
		case 4:
		case 5:
			m_n="sprng";
			break;
		case 6:
		case 7:
		case 8:
			m_n="summer";
			break;
		case 9:
		case 10:
		case 11:
			m_n="fall";
			break;
		case 12:
		case 1:
		case 2:
			m_n="winter";
			break;
		default :
			m_n="invalid input.";
		}
		
		System.out.printf("%s", m_n);
		
}

}