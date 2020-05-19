import java.util.Scanner;

public class Finonaaci {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		scn.close();
		int a = 0;
		int b=1;
		int c=1;
		while(c<=n+1) {
			System.out.println(a);
			int sum = a+b;
			a=b;
			b=sum;
			c+=1;
		}
	}

}
