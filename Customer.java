class Customer{   //encapsulated class

  private int customerId; //ID acting like a primary key
 private String firstName;
 private String middleName;    ///this all instance variables
 private String lastName;  //how did u access al the variables outside the class--it wil not able to see any data use getter n setter
  private String email;     //we can see data  inside the class
 private long phoneNumber;
 private String dob;
 private String address;
  //getter and setter--getter is used to get the data 
          //setter for customerId
  public void setCustomerId(int customerId){ // using setter--made public and use setcustomerid method
	  this.customerId = customerId;         //getter--
	  
	  
  }     //getter for customerId--return value
  public int getCustomerId(){
	   return customerId;
	   } 
	              //setter for address
	   public void setAddress(String address){
		   this.address = address;
		   }
		   public String getAddress(){
			   return address;													
		   }
		public void setFirstName(String firstName){
			this.firstName = firstName;
		}
		public String getFirstName(){
			return firstName;
		}
		public void setDob(String dob){
			this.dob = dob;
		}
		public String getDob(){
			return dob;
		}
		public void setLastName(String lastName){
			this.lastName = lastName;
		}
		public String getLastName(){
			return lastName;
		}
		public void setMiddleName(String middleName){
			this.middleName = middleName;
		}
		public String getMiddleName(){
			return middleName;
		}
		public void setEmail(String email){
			this.email = email;
		}
		public String getEmail(){
			return email;
		}
		public void setPhoneNumber(long phoneNumber){
			this.phoneNumber = phoneNumber;
		}
		public long getPhoneNumber(){
			return phoneNumber;
		}
    
}