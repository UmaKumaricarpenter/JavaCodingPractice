package string;

public class String_Questions {
	public static void main(String[] args) {
		
		String first = "Hello";
		
		String second = "world";
		
		System.out.println("String first = "+ first);
		System.out.println("String second = "+second);
		
		System.out.println("After string concatination");
		
		String s = "Hello"+"World";
		System.out.println(s);
		
		
		System.out.println("================================================");
		
		System.out.println("After uppercase string:");
	    s = s.toUpperCase();
		
		System.out.println(s);
		
		System.out.println("================================================");
		
		String str = "Beutifull place";
		String substr = "full";
		
		boolean result = str.contains(substr);
		if(result) {
			System.out.println(substr+ " is present in the string");
		}
		else {
			System.out.println(substr+ " is not  present in the string");
		
		}
		System.out.println("================================================");
		
		String str1 = "Beutifull place";
		System.out.println("Length of string: "+str1.length());
		
		System.out.println("================================================");
		
		String str2 = "Beutifull";
		System.out.println(str2.trim()+"Place");
		
		System.out.println("================================================");
		
		String str3 = "Beutifull place";
		String [] words = str3.split("\\s");
		for(String w:words ) {
			System.out.println(w);
		}
		
		System.out.println("================================================");
		
		String str4 = "Beutifull place";
		
		String reverseStr = "";
		
		for(int i = str4.length()-1; i>=0; i--) {
		
			reverseStr = reverseStr + str4.charAt(i);
		}
		System.out.println("Original string: "+str4);
		System.out.println("Reverse string: "+reverseStr);
		
		System.out.println("================================================");
		
		String str5 =new String ("Beutifull place");
		System.out.print("The extracted sub string is: ");
		System.out.println(str5.substring(10));
		
		System.out.println("================================================");
		
		String str6 = "Beutifull place";
		
		String replaceString = str6.replace('e', 'a');
		System.out.println("After replace String: "+replaceString);
		
		System.out.println("================================================");
		
		String st = "Beutifull place";
		String st2 = "Beutifull place";
		System.out.println(st.equals(st2));
		
		System.out.println("================================================");
		
		String st3 = "Beutifull place";
		String st4 = "Beutifull place";
		String st5 = "BEUTIFULL PLACE";
		String st6 = "Pretty girl";
		
		System.out.println(st3.equalsIgnoreCase(st4));
		
		System.out.println(st3.equalsIgnoreCase(st5));
		
		System.out.println(st3.equalsIgnoreCase(st6));
		
		System.out.println("================================================");
			
	}

}
