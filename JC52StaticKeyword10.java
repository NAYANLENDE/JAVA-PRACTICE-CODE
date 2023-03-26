class JC52StaticKeyword10 {
	public void show(){
		System.out.println("Non Static Show");
	}
	static public void show1(){
		System.out.println("I am in Static block");
	}
	{
		show();
	}
	static{
		show1();
	}
	public static void main(String[] args) {
		JC52StaticKeyword10 s=new JC52StaticKeyword10();
		System.out.println("I am in main");
	}
}
	