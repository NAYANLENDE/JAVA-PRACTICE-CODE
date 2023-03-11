import java.util.Scanner;
class Java3Grade {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter P1 Marks: ");
		double p1=sc.nextDouble();
		System.out.println("Enter P2 Marks: ");
		double P2=sc.nextDouble();
		System.out.println("Enter P3 Marks: ");
		double P3=sc.nextDouble();
		System.out.println("Enter P4 Marks: ");
		double P4=sc.nextDouble();
		System.out.println("Enter P5 Marks: ");
		double P5=sc.nextDouble();
		double total,per;
		String Gr;
		double P1 = 0;
		total=P1+P2+P3+P4+P5;
		per=total/5;
		  if (per>=90) {
			 Gr="A";
		  }
			 else if (per>=80 && per<90) {
				 Gr="B";
			 }
			 else if (per>=70 && per<80){
				 Gr="C";
			 }
			 else if (per>=60 && per<70) {
				 Gr="D";
			 }
			 else if (per>=50 && per<60) {
				 Gr="E";
			 }
			 else {
				 Gr=("Fail");
			 }
		  System.out.println("Percentage Obtained: "+per);
		  System.out.println("Grade is: "+Gr);
		  }
		}
	    

	


