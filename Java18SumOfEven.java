import java.util.Scanner;
class Java18SumOfEven {

	public static void main(String[] args) {
		int sm=0;
		for (int num=1;num<=20;++num) {
			if (num%2==0) {
				sm=sm+num;
			}
		}
		System.out.println("The Sum Of Even No. Is: "+sm);
		
	}

}
