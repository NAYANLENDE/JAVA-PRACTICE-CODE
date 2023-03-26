class JavaC16StringManipulators {
	public static void main(String[] args) {
		String str="nayan";
		System.out.println(str);
		String str1=new String("nayan");
		System.out.println(str1);

		char[] ch={'n','a','y','a','n'};
		String str3=new String(ch);
		System.out.println(str3);

		char[] ch1={'n','a','y','a','n','l','e','n','d','e'};
		String str4=new String(ch1,2,8);
		System.out.println(str4);

		byte[] b={65,66,67,68,69,70};
		String str5=new String(b);
		System.out.println(str5);

		byte[] b1={65,66,67,68,69,70};
		String str6=new String(b1,2,4);
		System.out.println(str6);
	}
}
	