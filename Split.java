class String_Test{
	public static void main(String[] args){
		String s="Call me Riya";
		String[] strArray=s.split(" ");
		for(int i=strArray.length-1; i>=0; i--)
			System.out.println(strArray[i]+" ");
		
	}
} /*Riya
me
Call*/
