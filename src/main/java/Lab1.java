//Centre College

public class Lab1 {

	/**This function will return the sum of the squares from 1 to n.
	* For instance if the number is 5, the solution would be 1*1+2*2+3*3+4*4+5*5= 55. 
	* If the value of n is less than 0, return -1
	*/
	   public static int squares(int n)
	   {
		   int sum = 0;
		   if (n < 0) {
			   return -1;
		   }
		   
		   for(int i = 1; i <= n; i++) {
			   sum += i*i;
			   
		  }
	      return sum;  
	   }
	   

	/**
	* This function that takes an array of integers and
	* an integer that describes how many numbers are in the array.  
	* The function will return the index(position) in the array with the largest number.
	* If the array is empty or there is an error, return -1.
	* If the maximum value is not unique, return the index of the first maximuim value.
	*/
	   public static int maxIndex(int array[],int len)
	   {
		   if (array == null) {
			   return -1;
		   }
		   int index = 0;
		   int greatest = array[0];
		   for(int i = 0; i < len; i++) {
			   if (greatest < array[i]) {
				   greatest = array[i];
				   index = i;
						   
		   }
		   }
		   return index;
	   }

	/**
	* This function that takes an array of integers, 
	* an integer that describes how many numbers are in the array.  
	* and a target number to look for.
	* This function will return true if the target number is within the array and false otherwise.
	*/
	   public static boolean seek(int array[],int len,int target)
	   {
		   for(int i = 0; i < len; i++) {
			   if (array[i] == target) {
				   return true;
			   }
			 }
	      return false;      
	  	
	      
	   }



	/**
	* This function takes an integer parameter and returns the nth number in the Fibonacci 
	* sequence.  The first 6 numbers of the sequence are as follows.  1,1,2,3,5,8.  Note
	* that 8 is the 6th number.  Be sure that your algorithm can return the
	* first and second Fibonacci numbers correctly.  You should solve this without recursion. 
	* If the input is below 1, retun 0;
	*/
	   public static int fib(int n)
	   {
		  int firstNum = 0;
		  int secondNum = 1;
		   if (n < 1) {
			   return 0;
		   }
		   
	       for(int i = 1; i <= n; ++i) {
	    	    int nextNum = firstNum + secondNum;
	    	    firstNum = secondNum;
	    	    secondNum = nextNum;
	    		   
	    	   }
		   return firstNum;
	   }

	   }
