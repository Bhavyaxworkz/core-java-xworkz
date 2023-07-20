class BookTester{

  public static void main(String args[]){
  
  Books book = new Books("Meditations","Mind &body","Marcus",234);
  
  System.out.println(book.name+" "+book.type+" "+book.author+" "+book.price);
  System.out.println(" ");

  Books book1 = new Books("Secret garden","Novel","Frances",185);
 
  System.out.println(book1.name+" "+book1.type+" "+book1.author+" "+book1.price);
  System.out.println(" ");
  
  Books book2 = new Books("the guide","Novel","Narayan",350);
 
  System.out.println(book2.name+" "+book2.type+" "+book2.author+" "+book2.price);  
  System.out.println(" ");
  
  Books book3 = new Books("Malgudi days","fictional story","narayan",300);
  
  System.out.println(book3.name+" "+book3.type+" "+book3.author+" "+book3.price);  
  System.out.println(" ");
  
  Books book4 = new Books("The private life","Nove","Mulk raj",650);
 
  System.out.println(book4.name+" "+book4.type+" "+book4.author+" "+book4.price);  
   System.out.println(" ");
   
  Books book5 = new Books("Train to pakistan","History","Satyadev",280);
 
  System.out.println(book5.name+" "+book5.type+" "+book5.author+" "+book5.price);  
  System.out.println(" ");
  
  Books book6 = new Books("Goden","Socioeconomic","Munishi Premchand",150);
  
  System.out.println(book6.name+" "+book6.type+" "+book6.author+" "+book6.price); 
  System.out.println(" ");
  
  Books book7 = new Books("The room on the roof","Noval","Ruskin bond",400);
  
  System.out.println(book7.name+" "+book7.type+" "+book7.author+" "+book7.price); 
  System.out.println(" ");
  
  Books book8 = new Books("Adventures of feluda","History","Satyajit ray",580);
  
  System.out.println(book8.name+" "+book8.type+" "+book8.author+" "+book8.price); 
  System.out.println(" ");
  
  Books book9 = new Books("Autobiography","person","Nirad Chaudhuri",380);
 
  System.out.println(book9.name+" "+book9.type+" "+book9.author+" "+book9.price); 
  System.out.println(" "); 
  
  
  }



}