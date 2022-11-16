//String methods usage
class String_Test{
	public static void main(String[] args){
		String s="JOhnanthan";
		String s1="Joshua";
System.out.println(s.equalsIgnoreCase(s1));//false
System.out.println(s1.indexOf("a"));//5
System.out.println(s+s1);//JOhnanthanJoshua
System.out.println(s.substring(2,3));//h
System.out.println(s1+" "+"Innu");//Joshua Innu
System.out.println(s1.concat(s));//JoshuaJOhnanthan
System.out.println(s1.startsWith("J"));//true
System.out.println(s.endsWith("s"));//false
System.out.println(s.endsWith("n"));//true
System.out.println(s.replace('J','S'));//SOhnanthan
System.out.println(s.indexOf("S"));//-1
System.out.println(s1.substring(2));//shua
	}
}