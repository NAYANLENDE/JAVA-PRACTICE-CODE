import java.util.Scanner;
class Java4ReverseNo {
     public static void main(String[] args) {
    	 Scanner in=new Scanner(System.in);
    	 System.out.println("Enter Number: ");
    	 int No=in.nextInt();
    	 int rev=0,rem;
    	 while (No>0) {
    		rem=No%10;
    		rev=rev*10+rem;
    		No=No/10;
    	 }
		System.out.println("The Reverse No. Is: "+rev);
	}

}
