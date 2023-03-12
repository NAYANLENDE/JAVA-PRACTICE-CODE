import java.util.Scanner;
class Java12PalindromeNo {
     public static void main(String[] args) {
    	 Scanner in=new Scanner(System.in);
    	 System.out.println("Enter the No.: ");
    	 int num=in.nextInt();
    	 int rem,rev=0;
    	 int num1=num;
    	 do {
    		 rem=num1%10;
    		 rev=rev*10+rem;
    		 num1=num1/10;
    	 }while(num1>0);
    	 
    	 if (rev==num) {
    		 System.out.println("The No. Is Palindrome No.: ");
    	 }else {
    		 System.out.println("The No. Is'nt Palindrome No.: ");
    	 } 
     } 
}	
	


