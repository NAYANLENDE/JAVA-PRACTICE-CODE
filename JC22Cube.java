import java.util.Scanner;
class JC22Cube {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.print("Enter No. Of terms: ");
		int n=in.nextInt();
		int cube;
		for (int i=1;i<=n;i++) {
			cube=i*i*i;
			System.out.println("Number is: "+i+" and Cube of "+i+" is: "+cube);
		}
	}
}


