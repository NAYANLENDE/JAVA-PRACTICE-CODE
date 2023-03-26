import java.util.Scanner;
class Rectangle2{
	int l,b,area;
	public Rectangle2(int x,int y){
		l=x;
		b=y;
	}
	public int Area(){
		area=l*b;
		return area;
	}
}
class JC39AreaOfRectangle{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Length and Breadth: ");
		int a=sc.nextInt();
		int c=sc.nextInt();
		Rectangle2 obj=new Rectangle2(a,c);
		int res=obj.Area();
		System.out.println("The Area Of Rectangle is "+res);
	}
}
