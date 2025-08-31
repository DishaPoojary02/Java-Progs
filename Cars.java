package car;

public class Cars 
{
	//instance members
	private String brand;  // brand
    private String model;   // model
    private double price;   // price
    private double mileage;   // mileage
	private String ownerName; //owner name
	
	  private static int totalCars;
	  private static String ShowroomName="Lakshmi cars";
	  public Cars( String b,String m,double p,double mil) {
	   brand=b;
	   model=m;
	   price=p;
	   mileage=mil;
	   ownerName="Not assigned";
	   totalCars++;
}
   // constructor 2 (overloaded)
   public void Car(String b, String m, double p, double mil, String owner) {
	   brand=b;
	   model=m;
	   price=p;
	   mileage=mil;
       this.ownerName ="Disha";
       totalCars++;
   }

   // getter & setter for ownerName
   public String getOwnerName() {
       return ownerName;
   }

   public void setOwnerName(String owner) {
       ownerName = owner;
   }
   		   
   // instance method
   public void displayDetails() {
       System.out.println("Brand: " + brand);
       System.out.println("Model: " + model);
       System.out.println("Price: " + price);
       System.out.println("Mileage: " + mileage);
       System.out.println("Owner: " + ownerName);
   }

   public void updatePrice(double newPrice) {
       price = newPrice;
   }	   
    		   
   // static methods
   public static void showTotalCars() {
       System.out.println("Total Cars: " + totalCars);
   }

   public static void showShowroomName() {
       System.out.println("Showroom: " + ShowroomName);
   }
}
 	
        
    		   
    		   
    		   
    		   
    		   
    		   
    		   
    		   
