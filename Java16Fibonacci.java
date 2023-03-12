import java.util.Scanner;
class Java16Fibonacci {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter First Value: ");
	int f0=sc.nextInt();
	System.out.println("Enter Second Value: ");
	int f1=sc.nextInt();
	System.out.print(f0+" "+f1);
	int count=10;
	for (int i=2;i<count;++i ) {
		int f2=f0+f1;
		System.out.println(" "+f2);
		f0=f1;
		f1=f2;
	   }
	}
}
	


