package stackpersons;

public class Person
{
	  

		private String name;
		private int age;
		private Gender gen;
		
	
		
		 Person(String name,int age,Gender gen)
		{
			this.name=name;
			this.age=age;
			this.gen=gen;
		
		}
         void displayPerson()
		{
			System.out.println("name:"+name);
			System.out.println("age:"+age);
			System.out.println("Gender:"+gen);
		}
		}


