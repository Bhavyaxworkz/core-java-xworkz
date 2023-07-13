class TravelAgency2Tester{
public static void main(String tester[]){
	//create,save,add
TravelAgency2.addtouristPlaces("Mysore");
TravelAgency2.addtouristPlaces("Udupi");
TravelAgency2.addtouristPlaces("Gokarna");
TravelAgency2.addtouristPlaces("Delhi");
TravelAgency2.addtouristPlaces("Hassan");
TravelAgency2.addtouristPlaces("Chikmangaluru");
TravelAgency2.addtouristPlaces("Murudeswara");
TravelAgency2.addtouristPlaces("Chamrajpete");
//Read,get,fetch
TravelAgency2.getAlltouristPlaces();
System.out.println(" ");
//update,edit
TravelAgency2.edittouristPlaces("Pondicherry","Delhi");   
 TravelAgency2.getAlltouristPlaces();
 int newLength = TravelAgency2.deletetouristPlaces("Chikmangaluru"); 
 System.out.println("Calling getAlltouristPlacesPostDeletion");
 TravelAgency2.getAlltouristPlacesPostDeletion(newLength);
 

}


}