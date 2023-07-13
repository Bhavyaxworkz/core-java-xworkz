class Garden2Tester{
public static void main(String tester[]){
	//create,save,add
Garden2.addflowerNames("Rose");
Garden2.addflowerNames("Marygold");
Garden2.addflowerNames("Sunflower");
Garden2.addflowerNames("Lily");
Garden2.addflowerNames("Jasmine");
Garden2.addflowerNames("Lotus");
Garden2.addflowerNames("Hibiscus");
Garden2.addflowerNames("Lavender");
//Read,get,fetch
Garden2.getAllflowerNames();
System.out.println(" ");
//update,edit
Garden2.editflowerNames("Bluebell","Jasmine");   
 Garden2.getAllflowerNames();
 int newLength = Garden2.deleteflowerNames("Hibiscus"); 
 System.out.println("Calling getAllflowerNamesPostDeletion");
 Garden2.getAllflowerNamesPostDeletion(newLength);
 

}


}