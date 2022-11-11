 public class StringNotFound{
	static void printStringCharcters(String s) {
		for(int i=0;i<s.length();i++)
			System.out.print("\t"+s.charAt(i));
		System.out.println();
	}
	public static void main(String args[]) {
		String str="Anudip";
		printStringCharcters(str);
		System.out.println(str.indexOf("d"));//3
		System.out.println(str.charAt(5));//p
		System.out.println(str.lastIndexOf("p"));//5
		}
}
