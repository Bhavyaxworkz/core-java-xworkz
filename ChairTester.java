class ChairTester{
 public static void main(String args[]){
  Chair chair = new Chair("Nirmala","Cream","Plastic",400.00);
  
 
  
    System.out.println(chair.name + " " + chair.color + " " + chair.type + " " + chair.price);

	
 
  Chair chair1 = new Chair("Nirmala","Black","Steel",700.00);
  
  System.out.println(chair1.name + " " + chair1.color + " " + chair1.type + " " + chair1.price);
  
  
  
  
  
  Chair chair2 = new Chair("Asha","Red","Wooden",800.00);
  
  System.out.println(chair2.name + " " + chair2.color + " " + chair2.type + " " + chair2.price);
  Chair chair3 = new Chair("Asha","Red","Wooden",700.00);
  
  System.out.println(chair3.name + " " + chair3.color + " " + chair3.type + " " + chair3.price);
 
 }


}