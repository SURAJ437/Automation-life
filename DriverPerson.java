package encapsulation;

public class DriverPerson {
	public static void main(String[] args) {
		Person obj = new Person();
		//obj.setname("SURAJ");
		System.out.println(obj.getname());
		obj.setname("Aditya");
		System.out.println(obj.getname());
	}
}
