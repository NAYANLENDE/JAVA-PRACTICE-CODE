import java.util.Scanner;
class Java8MulOfDigits {
      public static void main(String[] args) {
    	  Scanner nay=new Scanner(System.in);
    	  System.out.println("Enter Any Number: ");
    	  int no=nay.nextInt();
    	  int mul=1,rem;
    	  while (no>0) {
    		  rem=no%10;
    		  mul=mul*rem;
    		  no=no/10;
    	  }
     System.out.println("The Multiplication Of Digits Is: "+mul);
         }
     }
    	  
		

	


