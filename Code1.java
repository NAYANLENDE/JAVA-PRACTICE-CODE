
 class Test {

	static public void show(){
		System.out.println("Hi");
	}
	public void show1() {
		System.out.println("Hello");
	}
 }
 
 class Useme{
	 public static void main(String args[]) {
		 Test.show();
		 Test t=new Test();
		 t.show1();
	 } 
 }
	
		

	


