import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n =scn.nextInt();
		scn.close();
		if(n%2==0) {
			System.out.println(n + " is even");
			
		}else {
			System.out.println(n+ " is odd ");
		}

	}

}
