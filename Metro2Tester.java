class Metro2Tester{
public static void main(String tester[]){
	
Metro2.addstationNames("Kengeri");
Metro2.addstationNames("KR Puram");
Metro2.addstationNames("Hebbal");
Metro2.addstationNames("Rajanukunte");
Metro2.addstationNames("JP Nagar");
Metro2.addstationNames("Basavapura");
Metro2.addstationNames("Magadi Road");
Metro2.addstationNames("Indiranagara");
//Read,get,fetch
Metro2.getAllstationNames();
System.out.println(" ");
//update,edit
Metro2.editstationNames("Halasuru","Magadi Road");   
 Metro2.getAllstationNames();
 int newLength = Metro2.deletestationNames("Hebbal"); 
 System.out.println("Calling getAllstationNamesPostDeletion");
 Metro2.getAllstationNamesPostDeletion(newLength);
 

}


}