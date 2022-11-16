import java.util.Arrays;
public class string{
	public static void main(String[] args){
		String s=("Parrot","Butterfly","Bea","Bird");
		for(int i=0; i<s.length(); i++){
			for(int j=0;j<s.length();j++){
				if(s[i].compareTo(s[j]>0)){
					String temp=s[i];
					s[i]=s[j];
					s[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(s));
	}
}