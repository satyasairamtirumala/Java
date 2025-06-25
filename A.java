package javaprogrammer;
import java.util.*;
import java.util.ArrayList;
import java.math.*;
class A {
	    public static void countEvenOddDigits(int n) {
	        // code here
	       int val=0,Even=0,Odd=0;
	       while(n>0) {
	    	   val=n%10;
	    	   n=n/10;
	    	   if(val%2==0) {
	    		   Even++;
	    	   }
	    	   else {
	    		   Odd++;
	    	   }
	    	   
	       }
	       System.out.println("Even digits:"+Even);
	       System.out.println("Odd digits:"+Odd);
	    }
	    public static void main(String args[]) {
	    	Scanner sc =new Scanner(System.in);
	    	int n=sc.nextInt();
	    	A val=new A();
	    	val.countEvenOddDigits(n);
	    }
	}
