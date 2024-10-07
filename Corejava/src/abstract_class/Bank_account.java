package abstract_class;

public abstract class Bank_account {

		public abstract void Calculate_interest(double p, double r, int t);
		// this is the abstrct method that its implimentation part would be in child class
		 
		
		public void Saving_account() {
			
			System.out.println("I am saving account");
		}
        
		public void Checking_account() {
			
			System.out.println("check account Information:");
			
		}
	
		public Bank_account() {
			this(3) ;
			System.out.println("abstrct class normal contructor ");
			
			 
		 }
		
		//private constructor not direct access in child class. it is access by normal constructor help.
		private Bank_account(int Percentage) {
			System.out.println("Rate percent "+Percentage);
		}
	   

}

    //1- It can have abstract and non-abstract methods (method with the body).
    //concrete method and abs 
	//2- It needs to be extended 
	//3- It cannot be instantiated.
	//4- It can have constructors and static methods also.
	//5- It can have final methods which will force the subclass not to change the body of the method.
    //6- It do have conctructor it is while while we r making object of 
	//child class  at that time constructor of child class would be called
	//and we all know that there is first of child class const is super()
	