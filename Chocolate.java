record Chocolate(String Name,String Type,float Prize){
	Chocolate(){
		this("DairyMilk","buble",120f);
	}
	public static void main(String[] args){
		Chocolate c=new Chocolate("DairyMilk","buble",120f);
		Chocolate c1=new Chocolate("5 Star","Cadberry",20f);
		Chocolate c2=new Chocolate("Snikkers","nuts",50f);
		
		System.out.println(c);//Chocolate[Name=DairyMilk, Type=buble, Prize=120.0]
		System.out.println(c1);//Chocolate[Name=5 Star, Type=Cadberry, Prize=20.0]
		System.out.println(c2);//Chocolate[Name=Snikkers, Type=nuts, Prize=50.0]

	}
}
		