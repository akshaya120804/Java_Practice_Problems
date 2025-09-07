package javaproject;

import java.util.Scanner;

public class hello {
	public static void main(String[] args ) {
		Scanner sc = new Scanner (System.in);
		int  a = sc.nextInt();
		int  b = sc.nextInt();
		System.out.println("Arithmetic operators");
		System.out.println("Addition :"+(a+b));
		System.out.println("Subtraction :"+(a-b));
		System.out.println("Multiplication :"+(a*b));
		System.out.println("Division :"+(a/b));
		System.out.println("Modulos :"+(a%b));
		System.out.println("***********************************");
		System.out.println("Relational operators");
		System.out.println("Greater :"+(a>b));
		System.out.println("Lesser :"+(a<b));
		System.out.println("Greater equal to :"+(a>=b));
		System.out.println("Lesser equal to :"+(a<=b));
		System.out.println("Equal to :"+(a==b));
		System.out.println("Not  :"+(a!=b));

		System.out.println("***********************************");
		System.out.println("Logical operators");
		System.out.println("And :"+(a>b && b!=a));
		System.out.println("Or :"+(a<b ||b==0));
		System.out.println("Not  :"+!(a<b));
		System.out.println("***********************************");
		System.out.println("Bitwise operators");
		System.out.println("And :"+(a &b));
		System.out.println("Or :"+(a|b));
		System.out.println("Xor :"+(a^b));
		System.out.println("Left shift :"+(a>>b));
		System.out.println("Left shift :"+(a<<b));
		System.out.println("Complement  :"+(~b));
		System.out.println("***********************************");
		System.out.println("Assignment operators");
		System.out.println("Addition :"+(a+=b));
		System.out.println("Subtraction:"+(a-=b));
		System.out.println("Multiplication :"+(a*=b));
		System.out.println("Division :"+(a/=b));
		System.out.println("Modulos:"+(a%=b));
		System.out.println("***********************************");
		System.out.println("Unary operators");
		System.out.println("Pre add :"+(++b));
		System.out.println("Post add:"+(b++));
		System.out.println("Pre sub :"+(--a));
		System.out.println("Post sub :"+(a++));		
		System.out.println("***********************************");
			float n = 75;
			float f = 75/100;
			System.out.println(f);
		
		
	}
}
