package hello;

import java.util.Scanner;

import java.util.*;


public class Pattern9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of Rows :");
		int n = sc.nextInt();
		
		 
		
		 for(int i=1; i<=n; i++) {
			 
			 for(int j=0; j<=i; j++) {
				  int sum = i+j;
				 if( sum  % 2 == 0) {
					 
					
					System.out.print(1);
					}
				 else {
					 System.out.print(0);
					 
				 }
				 
			 }System.out.println();

	}

	}

}
