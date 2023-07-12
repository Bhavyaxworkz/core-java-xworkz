class ChaiPoint1{
//boolean isAdded = false;--without writing static is called instance

   //if refernce is not declared and intialize and the Array is stored with null values then code compiles and null wil be executed

 static String chaiAvailable[] = {null,null,null,null};
  static int index;
  //adds tea into chaiAvailable
public static boolean addChai(String chai){     //create operation is used
boolean isAdded = false;
//"Masala Tea" !=null
if(chai !=null){
	//chaiAvailable[0] = "Masala Tea";  //bcz increamenting the value 
	
	//chaiAvailable[1] = "Ginger Tea"; 
	//chaiAvailable[2] = "Lemon Tea"; 

chaiAvailable[index] = chai;                //add the data in  array using method addchai,with the index
index++;
isAdded = true;
}else{
System.out.println("Cannot add chai, as it is a null value");

}
return isAdded;
      }                             
                    //method
public static void getAllChaiAvailable(){
System.out.println("Invoking getAllChaiAvailable");

for(int chai=0; chai<chaiAvailable.length;chai++){
	String reference = chaiAvailable[chai];
	System.out.println("Accessing chai" + reference + "at" +chai);
}
System.out.println("end of getAllChaiAvailable");


}																																																																																																																																																																																																																																																																																																																																																																														
}























































































