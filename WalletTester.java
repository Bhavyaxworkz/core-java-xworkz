class  WalletTester{
	
 public static void main(String money[]){
 
 Wallet wallet = new Wallet("Levi's","Leather","Chinna",5000);
 System.out.println(wallet.name+" "+wallet.walletMaterialType+" "+wallet.contryOfOrigin+" "+wallet.price);
 System.out.println(" ");
 
 Wallet wallet1 = new Wallet("Coach Inc","Leather","India",7000);
 System.out.println(wallet1.name+" "+wallet1.walletMaterialType+" "+wallet1.contryOfOrigin+" "+wallet1.price);
 System.out.println(" ");

 Wallet wallet2 = new Wallet("Tommy Hilfiger","Leather","USA",7070);
 System.out.println(wallet2.name+" "+wallet2.walletMaterialType+" "+wallet2.contryOfOrigin+" "+wallet2.price);
 System.out.println(" ");


 Wallet wallet3 = new Wallet("Timberland","Leather","Australia",10000);
 System.out.println(wallet3.name+" "+wallet3.walletMaterialType+" "+wallet3.contryOfOrigin+" "+wallet3.price);
 System.out.println(" ");


 Wallet wallet4 = new Wallet("Fossil","Leather","America",6000);
 System.out.println(wallet4.name+" "+wallet4.walletMaterialType+" "+wallet4.contryOfOrigin+" "+wallet4.price);
 System.out.println(" ");

 Wallet wallet5 = new Wallet("Kelvin Klein","Leather", "Japan",9000);
 System.out.println(wallet5.name+" "+wallet5.walletMaterialType+" "+wallet5.contryOfOrigin+" "+wallet5.price);
 System.out.println(" ");

 Wallet wallet6 = new Wallet("Tumi","Leather","Singapore",9000);
 System.out.println(wallet6.name+" "+wallet6.walletMaterialType+" "+wallet6.contryOfOrigin+" "+wallet6.price);
 System.out.println(" ");

 Wallet wallet7 = new Wallet("Nike","Leather","Dubai",15000);
 System.out.println(wallet7.name+" "+wallet7.walletMaterialType+" "+wallet7.contryOfOrigin+" "+wallet7.price);
 System.out.println(" ");

 Wallet wallet8 = new Wallet("Nike","Leather","UK",15000);
 System.out.println(wallet8.name+" "+wallet8.walletMaterialType+" "+wallet8.contryOfOrigin+" "+wallet8.price);
 System.out.println(" ");

 Wallet wallet9 = new Wallet("Alpine Swiss","Leather","Germany",16000);
 System.out.println(wallet9.name+" "+wallet9.walletMaterialType+" "+wallet9.contryOfOrigin+" "+wallet9.price);
 System.out.println(" ");

}


}