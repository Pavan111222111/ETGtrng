package com.sonata;

public class HighDupeCount {
	 public void MaxRepeatingElement(int [] arrA){
		 int maxCounter = 0;
		 int element=0;
		 for (int i = 0; i <arrA.length ; i++) {
		 int counter =1;
		 for (int j = i+1; j <arrA.length ; j++) {
		 if(arrA[i]==arrA[j]){
		 counter++;
		 }
		 }
		 if(maxCounter<counter){
		 maxCounter=counter;
		 element = arrA[i];
		 }
		 }
		 System.out.println("Num of repeating times of a value is: " + element + ", maximum count: " + maxCounter);
		 }

		 public static void main(String[] args) {
		 int [] arrA = {4,1,5,2,1,5,9,8,6,5,3,2,4,7,4,4,8,1,4,4};
		 HighDupeCount m = new HighDupeCount();
		 m.MaxRepeatingElement(arrA);
		 }
		}
