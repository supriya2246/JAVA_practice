public class Factorialno{
	public static void main(String[]args){
		int i,fact=1;
		int number=10; //3628800
		for(i=1;i<=number;i++){
			fact=fact*i;
	}
System.out.println("factorial of 10:" +fact);
	}
}