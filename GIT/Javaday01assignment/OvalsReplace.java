package com.sonata;

public class OvalsReplace {

	   public static void main(String[] args) 
	   {
	      String string = "HAI ONE AND ALL";   
	      System.out.println("Input String : "+string);
	      string = string.replaceAll("[AEIOU]", "ABC");
	      System.out.println(string);
	   }
	}


