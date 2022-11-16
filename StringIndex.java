public class StringIndex{
	static void printStringCharacters(String s){
		for(int j=0;j<s.length();j++);
		System.out.println("\t"+s.charAt(j));
		System.out.println();
	}
	
	public static void main(String[]args){
		String str="ANUDIP";
		printStringCharacters(str);
		System.out.println(str.indexOf("U"));
		System.out.println(str.charAt(5));
		System.out.println(str.lastIndexOf("p"));
	}
}