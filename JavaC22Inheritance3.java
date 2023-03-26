//Program to achieve multiple inheritance
interface Abc{
	public void show();
}
class Pqr{
	static int i=20;
}
class JavaC22Inheritance3 extends Pqr implements Abc{
	public void show(){
		System.out.println("I am in Abc");
	}
	public static void main(String[] args) {
		Abc a;
		JavaC22Inheritance3 m=new JavaC22Inheritance3();
		a=m;
		a.show();
		System.out.println(i);
	}
}