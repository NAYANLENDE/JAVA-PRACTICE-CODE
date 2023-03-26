//Program to demonstrate getPriority() and setPriority()
class JavaC36Multithreading2 extends Thread{
	public void run(){
		System.out.println("Inside run method");
	}
	public static void main(String[] args) {
		JavaC36Multithreading2 t1=new JavaC36Multithreading2();
		JavaC36Multithreading2 t2=new JavaC36Multithreading2();
		JavaC36Multithreading2 t3=new JavaC36Multithreading2();
		System.out.println("t1 Thread Priority: "+t1.getPriority());
		System.out.println("t2 Thread Priority: "+t2.getPriority());
		System.out.println("t3 Thread Priority: "+t3.getPriority());
		t1.setPriority(2);
		t2.setPriority(5);
		t3.setPriority(8);

		//t3.setPriority(21); will throw IllegalArgumentException
		System.out.println("t1 Thread Priority: "+t1.getPriority());
		System.out.println("t2 Thread Priority: "+t2.getPriority());
		System.out.println("t3 Thread Priority: "+t3.getPriority());
	}
}
