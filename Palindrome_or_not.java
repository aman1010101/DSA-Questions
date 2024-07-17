package com;

import java.util.Scanner;

public class Palindrome_or_not {
	String name;
	boolean result=true;
	Palindrome_or_not(){
		System.out.println("Enter an name or String");
		Scanner sc = new Scanner(System.in);
		name=sc.nextLine();
		
	}
	public boolean palindrome_check() {
		for(int i=0;i<name.length()/2;i++) {
			if(name.charAt(i)!=name.charAt(name.length()-1-i)) {
				result =false;
			}
			
		}
		return result;
	}
	public void result_() {
		if(result==true) {
			System.out.println("Given String is an Palindrome");
		}else {
			System.out.println("Given String is not an Palindrome");
		}
	}
	

	public static void main(String[] args) {
		Palindrome_or_not check = new Palindrome_or_not();
		check.palindrome_check();
		check.result_();
		
		
	}

}
