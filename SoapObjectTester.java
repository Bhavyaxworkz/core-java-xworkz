class SoapObjectTester{
 
 public static void main(String args[]){
 
  SoapObject soap = new SoapObject("Mysoresandel","Body wash","Brown",50.00);
 
  System.out.println(soap.name+" "+soap.type+" "+soap.color+" "+soap.price);
  
  SoapObject soap1 = new SoapObject("Santtor","Body wash","Orange",60.00);
  
  System.out.println(soap1.name+" "+soap1.type+" "+soap1.color+" "+soap1.price);
 
 }



}