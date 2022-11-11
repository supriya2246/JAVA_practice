//print each charcter in the string and Non repeating 
class PrintEachCharNonRepeatingString{
	static void PrintStringCharacters(String s){
		for(int i=0;i<s.length();i++)
			System.out.println("\t"+s.charAt(i));
		System.out.println();
	}
		static void PrintNonRepeatedCharacters(String s){
        for(char i :s.toCharArray()){
			if(s.indexOf(i)==s.lastIndexOf(i)){
System.out.println("First non-repeating charcter is: "+i);
break;
		}
		}
	}
	public static void main(String []args){
		String str="MALAYALAM";
		PrintStringCharacters(str);//MALAYALAM
		PrintNonRepeatedCharacters(str);//y
		System.out.println(str.indexOf("Y"));//4
		System.out.println(str.charAt(5));//A
		System.out.println(str.lastIndexOf("A"));//7
	}
	}
		
		