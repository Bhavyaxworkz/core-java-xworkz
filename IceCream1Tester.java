class IceCream1Tester{

  public static void main(String ice[]){
	  
	  IceCream1.addFlavour("Strawberry");
	  IceCream1.addFlavour("Rasberry");
	  IceCream1.addFlavour("Chocolate");
	  IceCream1.addFlavour("Pineapple");
	  IceCream1.addFlavour("Blueberry");
	  IceCream1.addFlavour("Vanilla");
	  IceCream1.getAllFlavors();
	  boolean isUpdated = IceCream1.updateFlavours("Chocolate","Dark chocolate");
	  System.out.println("Is flavour name changed "+isUpdated);
	  IceCream1.getAllFlavors();
  }

}