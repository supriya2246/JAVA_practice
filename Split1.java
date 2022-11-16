//another method of split string
class String_Test{
	public static void main(String[] args){
		String s="i love music";
		String[] sa=s.split(" ");
		for(int i=0; i<sa.length; i++)
			System.out.println(sa[i]+" ");
	}
}/*i
love
music*/
