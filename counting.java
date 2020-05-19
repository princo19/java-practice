import java.util.Scanner;

public class counting {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		System.out.println(n);
		scn.close();
		int c = 1;
		while(c<=n) {
			System.out.println(c);
			c+=1;
		}

	}

}
