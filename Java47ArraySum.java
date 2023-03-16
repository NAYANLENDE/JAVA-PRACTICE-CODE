import java.util.Scanner;
class Java47ArraySum {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	int arr[]=new int[5],even=0,odd=0;
	int sum=0;
	System.out.println("Enter array elements: ");
	for (int i=0;i<5;i++) {
		arr[i]=sc.nextInt();
		}
	for (int i=0;i<5;i++) {
		if (arr[i]%2==0) {
			even++;
		}else {
			odd++;
		}
	}
	  System.out.println("Total Even = "+even+" and Odd = "+odd);
	}
}

	


