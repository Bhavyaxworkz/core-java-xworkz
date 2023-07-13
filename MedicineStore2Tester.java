class MedicineStore2Tester{
public static void main(String tester[]){
	//create,save,add
MedicineStore2.addmedicineNames("Dolo");
MedicineStore2.addmedicineNames("Cipla");
MedicineStore2.addmedicineNames("Paracetamol");
MedicineStore2.addmedicineNames("Losartan");
MedicineStore2.addmedicineNames("Azithromycin");
MedicineStore2.addmedicineNames("Addreall");
MedicineStore2.addmedicineNames("Antibiotics");
MedicineStore2.addmedicineNames("Antiseptic");
//Read,get,fetch
MedicineStore2.getAllmedicineNames();
System.out.println(" ");
//update,edit
MedicineStore2.editmedicineNames("Eye Drops","Addreall");   
 MedicineStore2.getAllmedicineNames();
 int newLength = MedicineStore2.deletemedicineNames("Cipla"); 
 System.out.println("Calling getAllmedicineNamesPostDeletion");
 MedicineStore2.getAllmedicineNamesPostDeletion(newLength);
 

}


}