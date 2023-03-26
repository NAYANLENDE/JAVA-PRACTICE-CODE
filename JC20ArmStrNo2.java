
class JC20ArmStrNo2 {
      public static void main(String[] args) {
		int sum=0,n;
		System.out.print("The Armstrong No. Between 1 to 1000 Are: ");
		for (int i=1;i<=1000;i++) {
			n=i;
			while (n>0) {
				int rem=n%10;
				sum=sum+(rem*rem*rem);
				n=n/10;
			}
			if (sum==i) {
				System.out.println(i+" ");
			}
			sum=0;
		}
	}		
}
		

	


