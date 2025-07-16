package aggrigation;

public class AggrigationChild {
	String city,state;
	AggrigationParent ref;
	public AggrigationChild(String city,String state,AggrigationParent ref) {
		this.city=city;
		this.state=state;
		this.ref=ref;
	}
	public void display() {
		System.out.println("Name:"+ref.name+" "+ref.roll_no+" "+ref.address);
		System.out.println(city+" "+state);
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AggrigationParent obj = new AggrigationParent("Nasif",11,"Nasif Manzil");
		AggrigationChild obj1 = new AggrigationChild("Kollam","Kerala",obj);
		obj1.display();
	}

}
