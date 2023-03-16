import java.util.Scanner;
class JC9Array6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[5];
		int sum=0;
		System.out.println("Enter Array Elements: ");
		for (int i=0;i<arr.length;++i) {
			arr[i]=sc.nextInt();
			
		}
		System.out.println("The Array Elements are: ");
		
		for (int i=0;i<5;++i) {
			System.out.println(arr[i]);
		}
	}
}


