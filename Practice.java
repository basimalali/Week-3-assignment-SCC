package application;
import java.util.Arrays;
import java.util.stream.Stream;

public class Practice {

	private Object nameLengths;

	public static void main(String[] args) {
		
//1.Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
		
//a.Programmatically subtract the value of the first element in the array from the value in the last element of the array (i.e. do not use ages[7] in your code). Print the result to the console.	
		int myArray = ages.length;
		int newValue = Math.abs(ages[myArray - myArray] - ages[myArray - 1]);
		
		System.out.println("The value of the first element and last element in the array is: " + newValue);
		
//b.Add a new age to your array and repeat the step above to ensure it is dynamic (works for arrays of different lengths).		
		
		int[] newAge = new int[ages.length];
				
		myArray = newAge.length;
		newAge[myArray - 1] = 300;
		newValue = Math.abs(newAge[myArray - myArray] - newAge[myArray - 1]);
		
		System.out.println("New value of two numbers is " + newValue);
		
//c.Use a loop to iterate through the array and calculate the average age. Print the result to the console.		
		
		int total = 0;
		for (int i = 0; i < newAge.length; i++) {
			total += newAge[i];
		}
		
		double averageAge = total / myArray;
		System.out.println("The average age is " + Math.round(averageAge));
		
// 2.	Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.		
		String [] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
	
//a. Use a loop to iterate through the array and calculate the average number of letters per name. Print the result to the console.		
		double newTotal = 0;
		for (int i= 0; i< names.length; i++) {
			newTotal += names[i].length();
		}
		
		double averageNumber = newTotal / names.length;
		System.out.println ("The average number of letters per name " + averageNumber);
	
//b.Use a loop to iterate through the array again and concatenate all the names together, separated by spaces, and print the result to the console.		

	String arrayNames = "";
	
	for (int i = 0; i < names.length; i ++) {
		
		arrayNames += names[i] + " ";
	}
	 System.out.println (arrayNames);
	 
	// Option two
	  Stream.of(names).forEach(System.out::println);

// 3.How do you access the last element of any array?
	  // find last element 
      //int last = list.get(list.size() - 1);  

// 4.How do you access the first element of any array?	  
	  
	  // find first element 
      //int first = list.get(0); 
	  
//5.Create a new array of int called nameLengths. Write a loop to iterate over the previously created names array and add the length of each name to the nameLengths array.
	  
	  int [] nameLengths = new int [names.length];
	  
		for (int i = 0; i < names.length; i++) {
			
			nameLengths[i] += names[i].length(); 
		}
		
// 6.Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array. Print the result to the console.	  
	  total = 0;
	  for (int i =0; i < nameLengths.length; i ++) {
	  
	  total += nameLengths[i];
	  
	  }
	  	System.out.println ("The sum of all the elements in the array " + total);
	  	
		System.out.println(multiConcat("Hello", 3));

	}
	
	  	
//7.Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n number of times. (i.e. if I pass in “Hello” and 3, I would expect the method to return “HelloHelloHello”).	  
	  
	  
	  	public static String multiConcat(String str, int num) {

	  	  String result = "";

	  	    for(int i= 0; i<= num ; i++)

	  	    {

	  	      result += str;

	  	    }

	  	  return result; 
	  	}

// 8.Write a method that takes two Strings, firstName and lastName, and returns a full name (the full name should be the first and the last name as a String separated by a space).	  	
	  
		public static void main1(String[] args) {

					String firstName = "Basim";

					String lastName = "Alali";

					String fullName = createFullName (firstName, lastName);

					System.out.println(fullName);
					

		}


		private static String createFullName(String firstName, String lastName) {

			// TODO Auto-generated method stub

			return firstName + " " + lastName;
			

		}
//9. Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.		

		private static int intArray(int[] a, int k)
	    {
	      if(k > 100) return 0;
	      else return a[k-1] + intArray(a, k-1);
	    }

	    public static int sum(int[] a)
	    {
	      return intArray(a, a.length);
	    }
	  
// 10.	Write a method that takes an array of double and returns the average of all the elements in the array.	  
	  
	 // Function that return average of an array.
	    static double average(int a[], int n)
	    {
	         
	        // Find sum of array element
	        int sum = 0;
	         
	        for (int i = 0; i < n; i++)
	            sum += a[i];
	     
	        return (double)sum / n;
	    }
	     
	    //driver code
	    @SuppressWarnings("unused")
		private static void main2 (String[] args)
	    {
	         
	        int arr[] = {10, 2, 3, 4, 5, 6, 7, 8, 9};
	        int n = arr.length;
	     
	        System.out.println(average(arr, n));
	    }
	
//11.Write a method that takes two arrays of double and returns true if the average of the elements in the first array is greater than the average of the elements in the second array	  
	  
	    
	    
//12. Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
	    
	    
//13.Create a method of your own that solves a problem. In comments, write what the method does and why you created it.
	  
	  
	    public static void main8(String[] args) {

			// TODO Auto-generated method stub



					String firstName = "Basim";

					String lastName = "Alali";

					String fullName = createFullName (firstName, lastName);

					

			System.out.println(fullName);

		}



		private static String createFullName1(String firstName, String lastName) {

			// TODO Auto-generated method stub

			return firstName + " " + lastName;

		}
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	
	}
	


