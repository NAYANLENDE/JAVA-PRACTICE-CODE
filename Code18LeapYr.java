import java.util.Scanner;
class Code18LeapYr {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter The Year: ");
	int year=sc.nextInt();
	if (year%4==0) {
		System.out.print("This is a Leap Year: ");
	}
	else {
		System.out.println("This is not a Leap Year: ");
		}
	}

}
