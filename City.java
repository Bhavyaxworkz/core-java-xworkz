class City{

 static String cityName[]={nul,nul,nul,nul,nul,nul};
static int index;
 
public static boolean addCityName(String city){     
boolean isAdded = false;

if(city! = null){
	//cityAvailable[0] = "Bangalore";  
	
	//cityAvailable[1] = "Mysore"; 
	//cityAvailable[2] = "Bangalore rural"; 

cityAvailable[index] = city;                
index++;
isAdded = true;
}else{
System.out.println("Cannot add city, as it is a null value");

}
return isAdded;
      }                             
                    
public static void getAllCityAvailable(){
System.out.println("Invoking getAllCityAvailable");

for(int city=0; city<cityAvailable.length;city++){
	String reference = cityAvailable[city];
	System.out.println("Accessing city" + reference + "at" +city);
}
System.out.println("end of getAllCityAvailable");


}																																																																																																																																																																																																																																																																																																																																																																														
}







































































                                              