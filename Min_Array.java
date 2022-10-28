class Array{
	static void min(int a[]){
		int minValue=a[0];
		for(int i=0; i<a.length;i++)
			if(minValue>a[i])
				minValue=a[i];
			System.out.println("min element: "+minValue);
	}
			public static void main(String[]args){
				int a[]={98,2,46,22,14,67,0,46};
				System.out.println("length of the array: "+a.length);
				min(a);
			}
				
	}/*length of the array: 8
min element: 0 */
