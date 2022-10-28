public class Max_Array{
static void max(int a[]){
		int maxValue=a[0];
		for(int i=0; i<a.length;i++)
			if(maxValue<a[i])
				maxValue=a[i];
			System.out.println("max element: "+maxValue);
	}
public static void main(String[]args){		
	int a[]={15,98,34,78,99,456,87};
	System.out.println("length of the array:"+a.length);
	max(a);
}
}/*length of the array:7
max element: 456*/
