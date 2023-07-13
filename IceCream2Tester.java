class IceCream2Tester{
public static void main(String tester[]){
	//create,save,add
IceCream2.addflavorNames("Strawberry");
IceCream2.addflavorNames("Chocolate");
IceCream2.addflavorNames("Vanilla");
IceCream2.addflavorNames("Butter Pecan");
IceCream2.addflavorNames("Buttersoktch");
IceCream2.addflavorNames("Black Current");
IceCream2.addflavorNames("Fruit Overload");
IceCream2.addflavorNames("Cotton Candy");
//Read,get,fetch
IceCream2.getAllflavorNames();
System.out.println(" ");
//update,edit
IceCream2.editflavorNames("French Vanilla","Black Current");   
 IceCream2.getAllflavorNames();
 int newLength = IceCream2.deleteflavorNames("Cotton Candy"); 
 System.out.println("Calling getAllflavorNamesPostDeletion");
 IceCream2.getAllflavorNamesPostDeletion(newLength);
 

}


}