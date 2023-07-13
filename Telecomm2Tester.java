class Telecomm2Tester{
public static void main(String tester[]){

Telecomm2.addsimNetworks("BSNL");
Telecomm2.addsimNetworks("Airtel");
Telecomm2.addsimNetworks("Jio");
Telecomm2.addsimNetworks("Vodaphone");
Telecomm2.addsimNetworks("Idea");
Telecomm2.addsimNetworks("Bharti Airtel");
Telecomm2.addsimNetworks("Verizon");
Telecomm2.addsimNetworks("Vodaphone Idea");
//Read,get,fetch
Telecomm2.getAllsimNetworks();
System.out.println(" ");
//update,edit
Telecomm2.editsimNetworks("Reliance","Vodaphone");   
 Telecomm2.getAllsimNetworks();
 int newLength = Telecomm2.deletesimNetworks("Verizon"); 
 System.out.println("Calling getAllsimNetworksPostDeletion");
 Telecomm2.getAllsimNetworksPostDeletion(newLength);
 

}


}