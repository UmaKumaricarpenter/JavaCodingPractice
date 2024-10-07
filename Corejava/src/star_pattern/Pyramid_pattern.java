package star_pattern;

public class Pyramid_pattern {
	public static void main(String[] args) {
		  
		System.out.println("Right half pyramid");
		
		for(int i=1; i<=5; i++) {
			for(int j=0; j<i; j++) {
				System.out.print("* ");
				
			}
			System.out.println(" ");
		}
		
		System.out.println("Reverse right half pyramid");
		
		for(int i=0; i<5; i++) {
			
			for(int j=0; j<5-i; j++) {
				
				System.out.print("* ");
			}
			System.out.println(" ");
		}
		
		System.out.println("Left half pyramid");
		
            for(int i=5; i>0; i--) {
			
			    for(int j=0; j<5; j++) {
				 
               	if(j< i-1)	{
               		System.out.print(" ");
               	}
               	else {
			    	System.out.print("*");
               	}
			 }
			   System.out.println(" ");
		}
            
            
         System.out.println("Reverse left half pyramid");
         
         for(int i=0; i<5; i++) {
        	 
        	 for(int j=0; j<5; j++) {
        		 
        		 if(j<i) {
        			 System.out.print(" ");
        		 }
        		 else {
        			 System.out.print("*");
        		 }
        	 }
        	 System.out.println(" ");
         }

		
	}

}
