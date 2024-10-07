package Statements;

public class Transfer_statement {
	public static void main(String[] args) {
		
		System.out.println("Transfer statement");
		System.out.println("================================================");
		
		System.out.println("Break statement example-1");
		
		for(int i=0; i<10; i++) {
			
			if(i==5) 
				break;
			System.out.println(i);
			
		}
		
		
		System.out.println("Break statement example-2");
			
		for(int i=0; i<10; i++) {
			for(int j=0; j<10; j++) {
					
				if(j==5) 
					break;
				System.out.println(i+" "+j);
						
			}
				
		}
						
		System.out.println("================================================");	
		
		System.out.println("Continue statement example-1");
		
		
		for(int i=0; i<10; i++) {
			
			if(i==5) 
				continue;
			System.out.println(i);
			
		}
		
		System.out.println("Continue statement example-2");
		
		for(int i=0; i<10; i++) {
			
			if(i%2==0) 
				continue;
			System.out.println(i);
			
		}
		
		System.out.println("Continue statement example-3");
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
					
				if(j==2) 
					continue;
				System.out.println(i+" "+j);
						
			}
				
		}
		
	}

}
