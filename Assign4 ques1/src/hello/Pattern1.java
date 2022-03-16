package hello;
import java.util.Scanner;


public class Pattern1 {

	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter value of Rows :");
		int n = sc.nextInt();
		Scanner sc1 = new Scanner(System.in);
		System.out.print("Enter value of Coloumns :");
		int m = sc1.nextInt();
		
				
		for (int i=1; i<=n; i++) {
			for(int j = 1; j<=m; j++) {
			
			System.out.print("*");
		
		}
			System.out.println( );
			
		
		

	}

	}
}