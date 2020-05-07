package questions;

import java.util.Scanner;

public class EvenOrOdd {
	public static void main(String[] args) {
	   //if no is divisible by 2 then its even else odd.
          
          System.out.println("enter a number ");
          Scanner x=new Scanner(System.in);
          int num = x.nextInt();
       

       if (num%2==0) {
	        System.out.println("number is even");
}     else {
            System.out.println("number is odd");
}
	}

}
