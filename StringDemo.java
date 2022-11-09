public class StringDemo{
	public static void main(String []args){
		String s1="RIYA";
		System.out.println(s1);//RIYA
		
		String s2=" ";
		System.out.println(s2);//EMPTY SPACE
		
		char[] ch={'I','N','N','U'};
		String s3=new String (ch);
		System.out.println(s3);//INNU
		
		byte[] b={14,22,46};
		String s4=new String(b);
		System.out.println(s4);//
		
		String s6=new String(s1);
	    System.out.println(s6+" "+s3);//RIYA INNU
		
		String s5=new String(ch,1,2);
		System.out.println(s5);//NN

}
}