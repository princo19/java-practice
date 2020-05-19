import java.util.Scanner;

public class GCD {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int divisor = scn.nextInt();
		int dividend = scn.nextInt();
		scn.close();
		while(dividend%divisor!=0) {
			int rem= dividend%divisor;
			dividend=divisor;
			divisor=rem;
		}System.out.println("H.C.F is:" + divisor);
	}

}
