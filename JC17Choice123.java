import java.util.Scanner;
class JC17Choice123 {
     public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter the choice: ");
	 System.out.println("1.Square\n2.Cube\n3.Check leap year");
	 int n=sc.nextInt();
	 switch(n) {
	 case 1:
		 System.out.println("Enter The No.: ");
		 int no=sc.nextInt();
		 System.out.println("The Square of "+no+" is "+(no*no));
		 break;
	 case 2:
		 System.out.println("Enter The No.: ");
		 int c=sc.nextInt();
		 System.out.println("The Cube of "+c+" is "+(c*c*c));
		 break;
	 case 3:
		 System.out.println("Enter The year: ");
		 int y=sc.nextInt();
		 if (y%4==0) {
			 System.out.println("The Year Is Leap Year.");
		 }else {
			 System.out.println("The Year Is Not Leap Year.");
		 }
		 break;
		 default:
			 System.out.println("Is Is Wrong Choice.");
			 
			 }
		 }
	 }




