package jojuskills;

public class Calculate {
int a,b;
public Calculate(int x, int y) {
	this.a=x;
	this.b=y;

}
 public int add(){
int res=a+b; //86
return res;
}
public static void main(String[]args) {
	Calculate C=new Calculate(25,61);
	System.out.println(C.add());
}
}
