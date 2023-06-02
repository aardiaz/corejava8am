package aggregation;

public class Test {
	
	public static void main(String[] args) {
		
		Car c = new Car();
		c.setColor("Blue");
		c.setCompany("Tesla");
		c.setModel("YUU900");
		c.setPrice(50000000);
		
		Employee  emp = new Employee();
		
		emp.setId(967);
		emp.setName("Bishnu Singh");
		emp.setSalary(800000);
		emp.setCar(c);
		
      System.out.println("ID = "+emp.getId());
      System.out.println("Name = "+emp.getName());
      System.out.println("Salary = "+emp.getSalary());
      System.out.println("========= car info ============");
      System.out.println("Color = "+emp.getCar().getColor());
      System.out.println("Model = "+emp.getCar().getModel());
      System.out.println("Company = "+emp.getCar().getCompany());
      
	}

}
