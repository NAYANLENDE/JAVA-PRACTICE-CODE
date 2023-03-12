import java.util.Scanner;
class Java7SumOfDigit {
     public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter The No.: ");
	int No=sc.nextInt();
	int sm=0,rem;
	while (No>0) {
		rem=No%10;
		sm=sm+rem;
		No=No/10;
	}
	System.out.println("The Sum Of Digits Is: "+sm);
     }

}
