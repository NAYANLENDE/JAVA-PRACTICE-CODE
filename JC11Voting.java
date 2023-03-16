import java.util.Scanner;
class JC11Voting {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Age: "); 
		int age=sc.nextInt();
		if (age>=18) {
		System.out.println("You Are Eligible For Voting. ");
		}
		else {
		System.out.println("You Are Not Eligible For Voting. ");
		}
	}
}
	

