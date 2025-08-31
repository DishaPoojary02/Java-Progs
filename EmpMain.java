package employee;

public class EmpMain {

	public static void main(String[] args) {
		//create new employees
       Employee e1 =new Employee ("Disha",001,10000);
       Employee e2 =new Employee ("Risha",002,50000);
       //display initial employee details
       System.out.println("Initail Details:");
       e1.display();
       e2.display();
       e1.increase_salary(0.1d);
       e2.increase_salary(0.2d);
       //display updated employee details
       System.out.println("Updated employee details:");
       e1.display();
       e2.display();
       
	}

}
