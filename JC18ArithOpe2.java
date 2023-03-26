import java.util.Scanner;
class JC18ArithOpe2 {
    
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int res;
		float div;
		System.out.print("Enter Any Two Numbers: ");
		int a=in.nextInt();
		int b=in.nextInt();
		System.out.print("Enter the choice: ");
		System.out.println("\n+ for Addition\n- for Subtraction\n* for Multiplication\n/ for Division" );
		char ch= in.next().charAt(0);
		switch(ch) {
		case '+':
			res=a+b;
			System.out.println("The Addition is: "+res);
			break;
		case '-':
			res=a-b;
			System.out.println("The Subtraction is: "+res);
			break;
		case '*':
			res=a*b;
			System.out.println("The Multiplication is: "+res);
			break;
		case '/':
			res=a/b;
			System.out.println("The Division is: "+res);
			break;
		default:
			System.out.println("It is Wrong Choice.");
			
			
		}
		
	}

}
