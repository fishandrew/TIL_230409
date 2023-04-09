import java.util.Scanner;
public class testcode4 {

	public static void main(String[] args) {
		int tot;
		Scanner input= new Scanner(System.in);
		System.out.print("Amount: ");
		tot= input.nextInt();
		
		int w_5m= tot/50000;
		int w_1m = (tot-50000*w_5m) / 10000;
		int w_5c = (tot-(50000*w_5m)-(10000*w_1m)) / 5000;
		int w_1c = (tot-(50000*w_5m)-(10000*w_1m)-(5000*w_5c)) / 1000;
		int w_5h = (tot-(50000*w_5m)-(10000*w_1m)-(5000*w_5c)-(1000*w_1c))/ 500;
		int w_1h = (tot-(50000*w_5m)-(10000*w_1m)-(5000*w_5c)-(1000*w_1c)-(500*w_5h))/100;
		int w_5t = (tot-(50000*w_5m)-(10000*w_1m)-(5000*w_5c)-(1000*w_1c)-(500*w_5h)-(100*w_1h))/50;
		int w_1t = (tot-(50000*w_5m)-(10000*w_1m)-(5000*w_5c)-(1000*w_1c)-(500*w_5h)-(100*w_1h)-(10*w_5t))/10;
		
		System.out.printf("50,000-won banknote: %d\n", w_5m);
		System.out.printf("10,000-won banknote: %d\n", w_1m);
		System.out.printf("5,000-won banknote: %d\n", w_5c);
		System.out.printf("1,000-won banknote: %d\n", w_1c);
		System.out.printf("500-won banknote: %d\n", w_5h);
		System.out.printf("100-won banknote: %d\n", w_1h);
		System.out.printf("50-won banknote: %d\n", w_5t);
		System.out.printf("10-won banknote: %d\n", w_1t);
		
		
		
	}

}
