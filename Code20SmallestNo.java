import java.util.Scanner;
class Code20SmallestNo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first no.: ");
		int a=sc.nextInt();
		System.out.println("Enter the second no.: ");
		int b=sc.nextInt();
		System.out.println("Enter the third no.: ");
		int c=sc.nextInt();
		System.out.println("Enter the fourth no.: ");
		int d=sc.nextInt();
		int sm=0;
		   if (a<b) {
		      if (a<c) {
		      if (a<d) {
		      sm=a;
		      }else {
		    	  sm=d;
		      }
		    }
		  }
		   if (b<a) {
			   if (b<c) {
				   if (b<d) {
					   sm=b;
				   }else {
					   sm=d;
				   }
			   }
		   }
		   if (c<a) {
			   if (c<b) {
				   if (c<d) {
				   sm=c;
				   }else {
					   sm=d;
				   }
			   }
		   }
		   if (d<a) {
			   if (d<b) {
				   if (d<c) {
					   sm=d;
				   }else {
					   sm=c;
				   }
			   }
		   }
		   System.out.println("The Smallest No. Is: "+sm);
	        }
	 }
				   
