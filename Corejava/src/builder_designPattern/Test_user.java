package builder_designPattern;

public class Test_user {
	
      public static void main(String[] args) {
		
		//.sutudy()
		
		User user1  = new User
				.UserBuilder().setUserName("Rakesh ")
				.setUserId("9211")
				.setUserEmail("Rakesh@gmail.com" )
				.build() ;	
		
		System.out.println(user1.getUserId());
		System.out.println(user1);
		
	}
	
	     
	  
}
