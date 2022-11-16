record TV(int TVInches, String Name, float Prize, String Type){
TV(){
	this(55,"LG",70000f,"Smart TV");
}
public static void main(String[] args){
	TV t=new TV(55,"LG",70000f,"Smart TV");
	TV t1=new TV(35,"SONY",50000f,"Smart TV");
	System.out.println(t);//TV[TVInches=55, Name=LG, Prize=70000.0, Type=Smart TV]
	System.out.println(t1);//TV[TVInches=35, Name=SONY, Prize=50000.0, Type=Smart TV]
}
}