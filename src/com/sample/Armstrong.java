package com.sample;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
          System.out.println("enter the number");
		  Scanner r=new Scanner(System.in);
		  int t=r.nextInt();
		  
		 int a=t, b, c=0;
		 r.close();
		 while(a>0)
		 {
			 b=a%10;
			 c=c+(b*b*b);
			 a=a/10;
			 
		 }
		 if (t==c) {
			 System.out.println("armstrong");
		 }
		 else
		 {
		  System.out.println("not a armstrong");
	}

}
}
