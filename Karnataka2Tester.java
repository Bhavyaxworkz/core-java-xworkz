class Karnataka2Tester{
public static void main(String tester[]){
	//create,save,add
Karnataka2.addcityNames("Bangalore");
Karnataka2.addcityNames("Mysore");
Karnataka2.addcityNames("Bagalkote");
Karnataka2.addcityNames("Hubli");
Karnataka2.addcityNames("Hassan");
Karnataka2.addcityNames("Mandya");
Karnataka2.addcityNames("Ramnagar");
Karnataka2.addcityNames("Kolar");
//Read,get,fetch
Karnataka2.getAllcityNames();
System.out.println(" ");
//update,edit
Karnataka2.editcityNames("Chikmangaluru","Hassan");   //updating the cardboard sheet in sketchpens
 Karnataka2.getAllcityNames();
 int newLength = Karnataka2.deletecityNames("Kolar"); 
 System.out.println("Calling getAllcityNamesPostDeletion");
 Karnataka2.getAllcityNamesPostDeletion(newLength);
 

}


}