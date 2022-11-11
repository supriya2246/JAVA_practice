 public class Supriya_Bank{
	int getInterest(){
	return 20;}
 }

class IDFC extends Supriya_Bank{
	int getInterest(){
	return 30;}
}

class SBI extends Supriya_Bank{
	int getInterest(){
	return 45;}
}

class CGB extends Supriya_Bank{
	int getInterest(){
	return 50;}
}

class BOI extends Supriya_Bank{
	int getInterest(){
	return 55;}
	}	
		
class Test_Bank{
	public static void main(String[] args){
		IDFC i=new IDFC();
		System.out.println("IDFC rate of interest:"+i.getInterest());
		SBI s=new SBI();
		System.out.println("SBI rate of interest:"+s.getInterest());
		CGB c=new CGB();
		System.out.println("CGB rate of interest:"+c.getInterest());
		BOI b=new BOI();
		System.out.println("BOI rate of interest:"+b.getInterest());
	}
}/*IDFC rate of interest:30
SBI rate of interest:45
CGB rate of interest:50
BOI rate of interest:55*/

 