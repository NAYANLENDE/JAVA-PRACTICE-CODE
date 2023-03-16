import java.util.Scanner;
class JC10EvenOdd {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter Any No.: ");
		int n=in.nextInt();
		if (n%2==0) {
		System.out.println("The No. Is Even ");
		}
		else {
		System.out.println("The No. Is Odd ");
		}
	}
}


