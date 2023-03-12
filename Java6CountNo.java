import java.util.Scanner;
class Java6CountNo {
     public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Any Number: ");
	int No=sc.nextInt();
	int count=0;
	 while (No>0) {
		 No=No/10;
		 ++count;
	 }
    System.out.println("The Number Of Digits Is: "+count);
     }
}


