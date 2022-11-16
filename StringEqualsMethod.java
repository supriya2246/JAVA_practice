//String method usage(String equals method)
class String{
	public static void main(String[] args){
	String s1="a";
	String s2="b";
	String s3="b";
	System.out.println(s1==s2);// false
	System.out.println(s3==s2);//true 
		System.out.println();
	String s4=new String("a");
	String s5=new String("b");
	String s6=new String("b");
	System.out.println(s4==s5);//false
	System.out.println(s5==s6);//false
	System.out.println(s5.equals(s6));//true
}
}
	