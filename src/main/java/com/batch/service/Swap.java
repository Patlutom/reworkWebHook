package com.batch.service;

public class Swap {
	public static void main(String[] args) {
		
		String a = "This is Ganesh";
		String b = "This is Gobinath....";
		
		a = a + b;
//		a = a.substring(a.length()-1, (a.length() -1 - b.length() -1));
		b =  a.substring(0, a.length() - b.length());
		a = a.substring(b.length(), a.length());
				
		System.out.println(a);
		System.out.println(b);
	}

}
