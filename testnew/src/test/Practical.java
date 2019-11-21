package test;

public class Practical {
	      
	    
	    static void result(int N) 
	    {      
	       
	        for (int num = N; num > 0; num--) 
	        {
	        	
	        	
	        	if (num % 5 == 0 && num % 3 != 0) 
	                System.out.println("Agile");
	        	
	        	else if (num % 3 == 0 && num % 5 != 0) 
	                System.out.println("Software");
	        	
	        	else if (num % 3 == 0 && num % 5 == 0) 
	                System.out.println("Testing"); 
	        	
	        	else  {
	        		System.out.println(num);
	        	}
	        } }
	    
	       
	    
	    public static void main(String []args) 
	    { 
	       
	        result(100); 
	    } 
	} 
	


