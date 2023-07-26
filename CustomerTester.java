class CustomerTester{
public static void main(String cos[]){
 Customer customer = new Customer();
 
 customer.setCustomerId(1);
 customer.setAddress("Rajajinagar");
 customer.setFirstName("Bhavya");
 customer.setDob("5-7-2001");
 customer.setLastName("Shree");
 customer.setMiddleName("Dyavappa");
 customer.setEmail("username@gmail.com");
 customer.setPhoneNumber(9953578567L);
 System.out.println(customer.getCustomerId()+ " " + customer.getAddress()+ " " + customer.getFirstName()
 + " " +customer.getDob() + " " + customer.getLastName()+ " " + customer.getMiddleName()+ " " +
  customer.getEmail()+ " " + customer.getPhoneNumber());

 
 //customer.firstName = "Baba";



}



}
