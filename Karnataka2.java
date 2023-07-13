class Karnataka2{

static String cityNames[]={"Bangalore",null,null,null,null,null,null,null};
 static int index=0;

public static boolean addcityNames(String cityName){
System.out.println("Invoking addcityNames");
System.out.println("No of parametrs : 1,type is String");
boolean isAdded = false;
if(cityNames.length>index){
if(cityName!=null && cityName.length()>0){

 cityNames[index++] = cityName;
 isAdded = true;

 }else{
 System.out.println("ohh..Elli places long ede");
 
 }
}else{
System.out.println("cityName cannot be null");
}
return isAdded;

}
public static void getAllcityNames(){
	System.out.println("List of cityNames are:");
	for(String cityName : cityNames){
		System.out.println(cityName);
	}

}
public static boolean editcityNames(String updatedcityName,String existingcityName){
	System.out.println("Invoking editcityNames");
System.out.println("No of Parameters : 2,type of parameter:String,String");
boolean isUpdated = false;
for(int cityIndex = 0; cityIndex < cityNames.length; cityIndex++){
	if(cityNames[cityIndex].equals(existingcityName)){   	
	        cityNames[cityIndex] = updatedcityName;			
             isUpdated = true;	
}
}
return isUpdated;
}
public static int deletecityNames(String deletedcityName){  
	System.out.println("Invoking editcityNames");
System.out.println("No of Parameters : 2,type of parameter:String,String");
boolean isDeleted = false;
int citiesIndex;
int noOfElements = cityNames.length;
for( citiesIndex = 0; citiesIndex < cityNames.length; citiesIndex++){
	if(cityNames[citiesIndex].equals(deletedcityName)){   
	       break;
	}
}                                                                   	
  if(citiesIndex<noOfElements){
	   noOfElements =  noOfElements-1;
	   for(int newcityIndex = citiesIndex; newcityIndex<noOfElements; newcityIndex++){
		   cityNames[newcityIndex] = cityNames[newcityIndex+1];
	   }
  }
  return noOfElements;
 	  
}
public static void getAllcityNamesPostDeletion(int newLength){
	for(int cityIndex =0;cityIndex <newLength;cityIndex++){
		System.out.println(cityNames[cityIndex]);
}
}
	
}

	