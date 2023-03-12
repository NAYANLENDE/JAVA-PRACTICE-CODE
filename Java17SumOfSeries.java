import java.util.Scanner;
import java.lang.Math;
class Java17SumOfSeries {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter The Value Of y: ");
	int y=sc.nextInt();
	double sum=1;
	for (int i=1; i<=y ;i++) {
		sum=sum+(Math.pow(y, i)/i);
		
	}
	System.out.println("The Sum Of Series Is: "+sum);
	}

}
