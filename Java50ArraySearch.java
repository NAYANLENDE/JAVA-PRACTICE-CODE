import java.util.Scanner;
class Java50ArraySearch {

	public static void main(String[] args) {
		int n,m,f=0,i=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the array length: ");
		 n=sc.nextInt();
		int arr[]=new int[n];
		System.out.print("Enter all array elements:");
		for ( i=0;i<n;++i) {
			arr[i]=sc.nextInt();
		}
		System.out.print("Enter the element that you want to find: ");
		m=sc.nextInt();
		   for ( i=0;i<n;++i) {
			   if (arr[i]==m) {
				   f=1;
				   break;
			   }
			   else {
				   f=0;
			   }
		   }
		   if (f==1) {
		System.out.print("Element found at position: "+(i + 1));
		   }else {
			   System.out.println("Element not found");
		   }
	}
}
			
			
		
	

	


