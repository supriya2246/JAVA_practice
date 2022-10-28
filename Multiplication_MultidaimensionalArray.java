class Multiplication_Array{
public static void main(String[]args){
	int a[][]={{1,3,5},{2,4,6}};
	int b[][]={{7,9,1},{8,2,4}};
	
	int c[][]=new int[2][3];
	for(int i=0;i<2;i++){
		for(int j=0;j<3;j++){
			c[i][j]=a[i][j]*b[i][j];
		
		System.out.print(c[i][j]+" ");
		}
		System.out.println();
	}
}
}/*7 27 5
16 8 24*/
