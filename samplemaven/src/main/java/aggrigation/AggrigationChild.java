package aggrigation;

public class AggrigationChild {
	String city,state;
	AggrigationParent studentdetails;
	public AggrigationChild(String city,String state,AggrigationParent studentdetails) {
		this.city=city;
		this.state=state;
		this.studentdetails=studentdetails;
	}
	public void display() {
		System.out.println("Name:"+studentdetails.name+" "+studentdetails.roll_no+" "+studentdetails.address);
		System.out.println(city+" "+state);
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AggrigationParent obj = new AggrigationParent("Nasif",11,"Nasif Manzil");
		AggrigationChild obj1 = new AggrigationChild("Kollam","Kerala",obj);
		obj1.display();
	}

}
