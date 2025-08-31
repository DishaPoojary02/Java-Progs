package employee;

public class Employee 
{
 String name ;
 int id;
 double salary;

 Employee (String n, int d,double sal)
 {
	 name=n;
	 id=d;
	 salary=sal;
 }
  void display()
	  {
		  System.out.println("Employee ID :"+id);
		  System.out.println("Name:"+name);
		  System.out.println("Salary:"+salary);
		  
		}
  void increase_salary(double per)
  {  
	  double increment=(salary*per)/100;
	  salary=salary+increment;
	  System.out.println("Employee salary incremented by :"+salary+"%");
   }
}