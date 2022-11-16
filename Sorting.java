import java.util.Arrays;
public class Sorting {
	public static void main(String[] raj){
		String[] sa= {"Mango","Bananna","Graphs","Apple","Pineapple"};
		for(int i=0; i<sa.length; i++) {
			for(int j=i+1; j<sa.length; j++) {
			if(sa[i].compareTo(sa[j])>0) { // It is less than assending order, grather than - desending order
			 String temp=sa[i];//SWAP
					sa[i]=sa[j];
					sa[j]=temp;
				}
			}
		}
			System.out.print(Arrays.toString(sa));
	}
}

