class Garden2{

static String flowerNames[]={"Rose",null,null,null,null,null,null,null};
 static int index=0;

public static boolean addflowerNames(String flowerName){
System.out.println("Invoking addflowerNames");
System.out.println("No of parametrs : 1,type is String");
boolean isAdded = false;
if(flowerNames.length>index){
if(flowerName!=null && flowerName.length()>0){

 flowerNames[index++] = flowerName;
 isAdded = true;

 }else{
 System.out.println("ohh..Elli flowers thumba ede");
 
 }
}else{
System.out.println("flowerName cannot be null");
}
return isAdded;

}
public static void getAllflowerNames(){
	System.out.println("List of flowerNames are:");
	for(String flowerName : flowerNames){
		System.out.println(flowerName);
	}

}
public static boolean editflowerNames(String updatedflowerName,String existingflowerName){
	System.out.println("Invoking editflowerNames");
System.out.println("No of Parameters : 2,type of parameter:String,String");
boolean isUpdated = false;
for(int flowerIndex = 0; flowerIndex < flowerNames.length; flowerIndex++){
	if(flowerNames[flowerIndex].equals(existingflowerName)){   	
	        flowerNames[flowerIndex] = updatedflowerName;			
             isUpdated = true;	
}
}
return isUpdated;
}
public static int deleteflowerNames(String deletedflowerName){  
	System.out.println("Invoking editflowerNames");
System.out.println("No of Parameters : 2,type of parameter:String,String");
boolean isDeleted = false;
int flowersIndex;
int noOfElements = flowerNames.length;
for( flowersIndex = 0; flowersIndex < flowerNames.length; flowersIndex++){
	if(flowerNames[flowersIndex].equals(deletedflowerName)){   
	       break;
	}
}                                                                   	
  if(flowersIndex<noOfElements){
	   noOfElements =  noOfElements-1;
	   for(int newflowerIndex = flowersIndex; newflowerIndex<noOfElements; newflowerIndex++){
		   flowerNames[newflowerIndex] = flowerNames[newflowerIndex+1];
	   }
  }
  return noOfElements;
 	  
}
public static void getAllflowerNamesPostDeletion(int newLength){
	for(int flowerIndex =0;flowerIndex <newLength;flowerIndex++){
		System.out.println(flowerNames[flowerIndex]);
}
}
	
}
