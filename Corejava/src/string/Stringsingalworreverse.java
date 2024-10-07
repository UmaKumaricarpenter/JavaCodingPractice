package string;

public class Stringsingalworreverse {
	
	public static void main(String[] args) {
		String str = "Sharma is a good player and he is so puntual";
		
		String [] str2 = str.split(" ");
		
		System.out.println(str2.length);
		
		for(int i=0; i<str2.length; i++) {
			String reverse = str2[i];
			String r = "";
			
			for(int j = reverse.length()-1; j>=0; j--)
				r = r+reverse.charAt(j);
			
		     System.out.print(r+" ");
		}	
		
	}

}
