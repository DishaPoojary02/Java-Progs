package transport;
 
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	     // 1) constructor chain: Vehicle -> Bicycle -> EBike 
        Ebike e = new Ebike("EB-101", 50); 
        e.deliver("Sandwich", "Library"); 
 
        // 2) abstract restriction (uncomment to see compile error) 
        // Vehicle v = new Vehicle("V-1"); 
 
        // 3) interface + final rule check 
        Drone d = new Drone("DR-1"); 
        d.deliver("Notes", "ExamCell");   // blocked 
        d.deliver("USB", "CSE Block");    // allowed
        
        // 4) Payable demo 
        double bill = d.cost(5); 
        System.out.println("Drone delivery cost: Rs." + bill); 
    } 
} 
    
	


