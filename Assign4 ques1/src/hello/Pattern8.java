package hello;

import java.util.Scanner;

public class Pattern8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of Rows :");
		int n = sc.nextInt();
		int m = 1;
		
		 for(int i=1; i<=n; i++) {
			 
			 for(int j=0; j<=i; j++) {
				 
				 System.out.print(m);
				 m++;
				 
			 }System.out.println();

	}
}
}
