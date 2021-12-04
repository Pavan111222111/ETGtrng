package com.sonata;

public class Product {
		int proID;
		String proName;
		int proPrice;
		public double totalPrice(float GST) {
			 double total=this.proPrice+GST*this.proPrice;
			 return total;
		 }
		public void display() {
			System.out.println("product name:"+proName);
			System.out.println("product ID:"+proID);
			System.out.println("product price:"+proPrice);
			
		}
		public static void main(String arg[]) {
			Product p1=new Product();
			p1.proID=282;
			p1.proName="mobile";
			p1.proPrice=20000;
			p1.display();
			System.out.println("The total price of the product is: " +p1.totalPrice(0.02f));
		}
	}


