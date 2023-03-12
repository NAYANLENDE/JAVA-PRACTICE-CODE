import java.util.Scanner;
class Java11ArmStrNo{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Any Number: ");
		int no=sc.nextInt();
		int rem,sum=0;
		int no1=no;
		do{
                 rem=no1%10;
                 rem=rem*rem*rem*rem;
                 sum=sum+rem;
                 no1=no1/10;
		}while(no1>0);

		if (sum==no) {
		 	System.out.print("This is Amstrong Number"+no);
		}else {
		 	System.out.print("This is not a Amstrong Number"+no);
		}
	}
}


