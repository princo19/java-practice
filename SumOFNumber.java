import java.util.Scanner;

public class SumOFNumber {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		System.out.println(n);
		scn.close();
		int c=1;
		int sum=0;
		while(c<=n) {
			sum+=c;
			
			c+=1;
		}
		System.out.println("Sum of "+n+ " number is "  + sum);

	}

}
