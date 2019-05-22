package com.test.demo;


public class NumConvertToStr {
	/**
	 * When the number%3=0,the console will print "Fizz",when the number%5=0,the console will print "Buzz",
	 * when the number%3=0 and the number%5=0,the console will print "FizzBuzz",otherwise print the number.
	 */
	public static void convert() {
		final String fizz = "Fizz";
		final String buzz = "Buzz";
		Object[] arr = new Object[100];
		for(int i = 0; i<arr.length;i++) {
			int j = i+1;
			if((j)%3==0) {
				arr[i] = fizz; 
			}
			if(j%5==0) {
				if(fizz == arr[i]) {
					arr[i] = fizz+buzz;
				}else {
					arr[i] = buzz;
				}
			}
			if(j%3!=0 && j%5!=0) {
				arr[i] = j;
			}
		}
		
		for (int i = 0; i<arr.length ; i++) {
			System.out.println(arr[i]);
		}
	}
	
}
