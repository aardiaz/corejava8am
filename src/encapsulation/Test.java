package encapsulation;

public class Test {
	
	 public static void main(String[] args) {
		
		 Customer c =  new Customer();
		 
		 c.setId(8987);
		 c.setName("Ramesh Bam");
		 c.setAge(40);
		 c.setCity("Dang");
		 c.setPhone("9876545678");
		 
		 System.out.println(c);
		 
//		 System.out.println("Id = "+c.getId());
//		 System.out.println("Name = "+c.getName());
//		 System.out.println("Age = "+c.getAge());
//		 System.out.println("City = "+c.getCity());
//		 System.out.println("Phone = "+c.getPhone());
		 
	}
}
