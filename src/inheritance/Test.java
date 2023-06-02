package inheritance;

public class Test {
	
	public static void main(String[] args) {
		
		Programmer p = new Programmer();
		p.id = 888;
		p.name = "Sagar Thapa";
		p.company = "Google";
		p.salary = 300000;
		p.bonus = 59000;
		p.progLang = "Java";
		p.project = "CMS";
		
		p.print();
	}
	

}
