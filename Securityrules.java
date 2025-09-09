package transport;

public final class Securityrules 
{
	private Securityrules() 
	{
	}
	
public static boolean canFly(String place) 
{ 
    if(place=="ExamCell")  
        return false; 
    else 
        return true; 
}
}
