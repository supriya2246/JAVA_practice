public class Supriya {
	int rollno;
	String name;
	double fee;
  Supriya(int rollno, String name, double fee) {// Paramertized constructor
	 this.rollno=rollno;
	 this.name=name;
	 this.fee=fee; }
  void dispaly() {
    System.out.println(rollno+ " "+name+ " "+fee); }
public static void main(String args[]) {
Supriya s=new Supriya(111,"sup",1000f);
Supriya s2=new Supriya(112,"riya",1500f);
	s2.dispaly();
	s.dispaly();
	}
	}