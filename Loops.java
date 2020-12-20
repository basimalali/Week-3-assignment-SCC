package application;

public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	// a. A while loop that prints all even numbers from 0 to 100
		int i = 0;
	    while (i < 102) {
	      System.out.println(i);
	      i += 2;
    }
		
	    
	// b. A while loop that prints every 3rd number going backwards from 100 until we reach 0   
	    
	    int z = 100;

		while (z >= 0) {
			System.out.println(z);
			z -= 3;
		}
		
	//c. A for loop that prints every other number from 1 to 100
		for (int a = 1;  a <= 100; a += 2) {
			System.out.println(a);
		}
				
	//A for loop that prints every number from 0 to 100, but if the number is divisible by 3, it prints “Hello” instead of the number, and if the number is divisible by 5, it prints “World” instead of the number, and if it is divisible by both 3 and 5, it prints “HelloWorld” instead of the number.
		for (int j=1; j<100; j++) {
			if (j%3==0) 
			System.out.println("Hello");			
		}			
				
		for (int j=1; j<100; j++) {
			if (j%5==0) System.out.println("World");			
		}
				
		for (int j=1; j<100; j++) {
			if (j%3==0 && j%5==0) System.out.println("HelloWorld");			
		}
	    
	    
	}

}
