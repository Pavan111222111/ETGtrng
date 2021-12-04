package com.sonata;

public class Tshirt {
	
		String color;
		String material;
		String design;
		String size;
		Tshirt(String a,
		String b,String c,String d){
			this.color= a;
			this.material= b;
			this.design=c;
			this.size=d;
		}
	Tshirt(){
		
	}
	public void Display() {
		System.out.println(color);
		System.out.println( design);
		System.out.println( material);
		System.out.println( size);
	}
		public static void main(String[] args) {
			Tshirt t1=new Tshirt("black","silk","v- neck","small");
			Tshirt t2=new Tshirt("red","nylon","collar","large");
			Tshirt t3=new Tshirt("white","tericotton","v-shaped","extra-large");
			System.out.println("first Tshirt:");
			t1.Display();
			System.out.println("second Tshirt:");
			t2.Display();
			System.out.println("third Tshirt:");
			t3.Display();
		}

	}
	


