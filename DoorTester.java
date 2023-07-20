class DoorTester{
 
 public static void main(String lock[]){
 
  Doors door = new Doors("CRC","Single door",1700,10);
  System.out.println(door.name+" "+door.type+" "+door.price+" "+door.weight);
  System.out.println(" ");  
  
  Doors door1 = new Doors("Haspel","Single door",10000,14);
  System.out.println(door1.name+" "+door1.type+" "+door1.price+" "+door1.weight);
  System.out.println(" "); 
  
  Doors door2 = new Doors("dwarakaplywood","Double Door",8000,30);
  System.out.println(door2.name+" "+door2.type+" "+door2.price+" "+door2.weight);
  System.out.println(" "); 
  
  Doors door3 = new Doors("APD 001 Interior Door","Single Door",6200,30);
  System.out.println(door3.name+" "+door3.type+" "+door3.price+" "+door3.weight);
  System.out.println(" "); 
  
  Doors door4 = new Doors("ABHILASH PORWAL","Single Door",2699,10);  
  System.out.println(door4.name+" "+door4.type+" "+door4.price+" "+door4.weight);
  System.out.println(" "); 
  
  Doors door5 = new Doors("Anil Wooden_Door_9 Interior Door","Single Door",3999,9);
  System.out.println(door5.name+" "+door5.type+" "+door5.price+" "+door5.weight);
  System.out.println(" "); 
  
  Doors door6 = new Doors("nilamanimishra wooden door","Single door",7999,50);
  System.out.println(door6.name+" "+door6.type+" "+door6.price+" "+door6.weight);
  System.out.println(" "); 
  
  Doors door7 = new Doors("DeviAlluminium Aluminium door","Single Door",8000,25);
  System.out.println(door7.name+" "+door7.type+" "+door7.price+" "+door7.weight);
  System.out.println(" "); 
  
  Doors door8 = new Doors("K I DESIGNER Interior Door","Single door",5999,9);
  System.out.println(door8.name+" "+door8.type+" "+door8.price+" "+door8.weight);
  System.out.println(" "); 
  
  Doors door9 = new Doors("APD DESIGNER Interior","Single door",3999,14);
  System.out.println(door9.name+" "+door9.type+" "+door9.price+" "+door9.weight);
  System.out.println(" "); 
 
 }

}