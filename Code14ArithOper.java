import java.util.Scanner;
class Code14ArithOper {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("\nEnter 1st no.: ");
		int a=sc.nextInt();
		System.out.print("\nEnter 2nd no.: ");
		int b=sc.nextInt();
		Scanner ch=new Scanner(System.in);
		System.out.println("1.Add\n2.Sub\n3.mul\n4.div");
		System.out.println("Enter Your Choice: ");
		int n=ch.nextInt();
		switch (n){
		   case 1:
			 int res=a+b;
		     System.out.println("Addition is "+res);
		     break;
		   case 2:
			 int res1=a-b;
			 System.out.println("Subtraction is "+res1);
			 break;
		   case 3:
			 int res2=a*b;
			 System.out.println("Multiplication is "+res2);
		   case 4:
			   float res3=a/b;
			   System.out.println("Division is "+res3);
			   break;
		   default:
				System.out.println("Wrong Choice. ");
				break;
				}
	}

}
