import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n= scn.nextInt();
		scn.close();
		int d= 2;
		boolean flag  = true;
		while(d<=n-1) {
			if(n%d==0) {
				flag = false;
			}d+=1;
			
		}if(flag==true) {
			System.out.println( n + " is prime");
		}else {
			System.out.println(n +" is not prime");
		}
		
		

	}

}
