class IceCream{
 static String flavors[] = {null,null,null,null,null,null};
 static int index;
 
 public static boolean addFlavour(String ice){
	 boolean isCreated = false;
	 if(ice!=null){
		flavors[index]=ice;
		index++;
		isCreated=true;
	 }else{
		 System.out.println("Cannot store the value");
	 }
	 return isCreated;
 }
 
 public static void getAllFlavors(){
	 for(int ice=0;ice<flavors.length;ice++){
		 String referenec = flavors[ice];
		 System.out.println("Accessing the ice cream "+referenec+" is "+ice);
	 }
 }

}