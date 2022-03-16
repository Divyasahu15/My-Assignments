package hello;

import java.util.Scanner;

public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter value of Rows :");
		int n = sc.nextInt();
		Scanner sc1 = new Scanner(System.in);
		System.out.print("Enter value of Coloumns :");
		int m = sc1.nextInt();
		for(int i=0; i<n; i++) {
	           for(int j=0; j<m; j++) {
	               if(i == 0 || i == n-1 || j == 0 || j == m-1) {
	                   System.out.print("*");
	               } else {
	                   System.out.print(" ");
	               }
	           }
	           System.out.println();


}
		 }
		 }
	
		

