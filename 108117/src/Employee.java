
public class Employee {
	
	String name;
	Employee(String name)
	{
		this.name=name;
	}
	void display()
	{
		System.out.println("Name: "+name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Employee e = new Employee("Fayaz");
         e.display();
	}
}