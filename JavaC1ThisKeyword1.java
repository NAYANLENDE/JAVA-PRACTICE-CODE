class JavaC1ThisKeyword1 {
	int a,b;
	JavaC1ThisKeyword1(int a,int b){
		this.a=a;
		this.b=b;
	}
	void display(){
		System.out.println("a="+a+" b="+b);
	}
	public static void main(String[] args) {
		JavaC1ThisKeyword1 obj=new JavaC1ThisKeyword1(40,80);
		obj.display();
	}
}
	