//example for parameterized constructor
public class Student{
int studid;
String name;
Student(int sno,String n){//parameterized constructor:
this.studid=sno;
this.name=n;
}
void display(){
System.out.println(studid+" "+name);}
public static void main(String[]args){
Student s=new Student(22,"supriya");
Student s2=new Student(14,"sandeep");
s.display();
s2.display();
}
}
