public class StringDemo{
public static void main(String[]args){
	
String s1=new String("Supriya");
System.out.println(s1);//Supriya

String s2=new String(" ");
System.out.println(s2);// space

String s3=new String("JOHNATHAN");
System.out.println(s3);//JOHNANTHAN

String s4=new String(s1);
System.out.println(s4);//Supriya


char[] ch={'P','R','I','Y','A'};
String s5=new String(ch);
System.out.println(s5);//PRIYA

String s6=s3;
System.out.println(s6);//JOHNANTHAN

}
}