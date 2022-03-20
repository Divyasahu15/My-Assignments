package hello;
import java.util.Scanner;

public class Fabonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  int n = 20;          
          int a=1;
          int b =1;
          
         
           int c = a+b;
          System.out.print(a+" "+b+" ");
          
          for(int i =2; i<20; i++) {
        	  c = a+b;
        	  System.out.print(c+" ");
        	  
        	  n=n+c;
    		  a=b;    
    		  b=c;    
          }
          float m = c;
          System.out.println("The average is "+m/20);
          
          
	}
 
}
