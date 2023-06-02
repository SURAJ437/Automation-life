package encapsulation;

public class DriverQspider {

	public static void main(String[] args) {
		int id=1;
		Qspider obj = new Qspider();

		obj.setName("SURAJ");
		obj.setPnum("7353466940");
		String Name = obj.getName();
		String Phnum = obj.getPnum();

		System.out.println(id++);
		System.out.println(Name);
		System.out.println(Phnum);

		obj.setName("Aditya");
		obj.setPnum("9123456780");
		String Name1 = obj.getName();
		String Phnum1 = obj.getPnum();
		
		System.out.println(id++);		
		System.out.println(Name1);
		System.out.println(Phnum1);
	}
}
