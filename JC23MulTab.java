import java.util.Scanner;
class JC23MulTab {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.print("Enter the NO.: ");
		int n=in.nextInt();
		for (int i=0;i<=10;i++) {
			System.out.println(n+" * "+i+" = "+(n*i));
		}
	}
}


