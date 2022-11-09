public class StringPooling{
	public static void main(String[]args){
		String s1="A";
		String s2="B";
		String s3="B";
		System.out.println(s1==s2);//false
		System.out.println(s2==s3);//true
		
		String s4=new String("A");
		System.out.println(s1==s4);//false
		System.out.println(s4.equalsIgnoreCase(s1));//true
		
		String s5=new String("c");
		String s6=new String("c");
		System.out.println(s5==s6);//false
		System.out.println(s5.equals(s6));//true
	}
}