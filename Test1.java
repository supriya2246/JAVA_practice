public class Test1{
int a=100;
void m1(){
System.out.println("this is M()");}

void Test1(){
System.out.println("Constructor");}

{System.out.println("non static block");}

public static void main(String []args){
	System.out.println("main method");
	Test1 t=new Test1();//object declaration
	System.out.println(t.a);
	t.m1();
}
}