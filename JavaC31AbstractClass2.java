//If the child class is unable to provide implementation of all methods of abstract class then we can declare th child
//child class with abstract modifier and complete the remaning method implementations in next created child classes.
abstract class Test{
	abstract void m1();
	abstract void m2();
	abstract void m3();
	void m4(){
		System.out.println("m4 method");
	}
}  
abstract class Test1 extends Test{
	void m1(){
		System.out.println("m1 method");
	}
}
abstract class Test2 extends Test1{
	void m2(){
		System.out.println("m2 method");
	}
}
class JavaC31AbstractClass2 extends Test2{
	void m3(){
			System.out.println("m3 method");
		}
	public static void main(String[] args) {
		JavaC31AbstractClass2 t=new JavaC31AbstractClass2();
		t.m1();
		t.m2();
		t.m3();
		t.m4();
	}
}
