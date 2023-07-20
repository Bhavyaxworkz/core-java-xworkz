class MusicalInstrumentsTester{
 
  public static void main(String args[]){
   
   MusicalInstruments instrument = new MusicalInstruments("Pianon","Chordophones","Black",8000);
   
   System.out.println(instrument.name+" "+instrument.type+" "+instrument.color+" "+instrument.price);
   System.out.println(" ");  

   MusicalInstruments instrument1 = new MusicalInstruments("Guitar","Stringedinstrument","Blue color",5600);
   
   System.out.println(instrument1.name+" "+instrument1.type+" "+instrument1.color+" "+instrument1.price);
   System.out.println(" ");

   MusicalInstruments instrument2 = new MusicalInstruments("Saxophone","windinstrument","Golden color",8000);
   
   System.out.println(instrument2.name+" "+instrument2.type+" "+instrument2.color+" "+instrument2.price);
   System.out.println(" ");

   MusicalInstruments instrument3 = new MusicalInstruments("Violin","Stringed instrument","Mustard",5600);
   
   System.out.println(instrument3.name+" "+instrument3.type+" "+instrument3.color+" "+instrument3.price);
   System.out.println(" ");

   MusicalInstruments instrument4 = new MusicalInstruments("Clarinet","windinstrument","Silver",2500);
   
   System.out.println(instrument4.name+" "+instrument4.type+" "+instrument4.color+" "+instrument4.price);
   System.out.println(" ");

   MusicalInstruments instrument5 = new MusicalInstruments("Xylophone","Percussioninstrument","Brown",4000);
   
   System.out.println(instrument5.name+" "+instrument5.type+" "+instrument5.color+" "+instrument5.price);
   System.out.println(" ");

   MusicalInstruments instrument6 = new MusicalInstruments("Electronickeyboard","Chordophones","White",6700);
   
   System.out.println(instrument6.name+" "+instrument6.type+" "+instrument6.color+" "+instrument6.price);
   System.out.println(" ");

   MusicalInstruments instrument7 = new MusicalInstruments("Accodion","Chordophones","Red",6000);
   
   System.out.println(instrument7.name+" "+instrument7.type+" "+instrument7.color+" "+instrument7.price);
   System.out.println(" ");

   MusicalInstruments instrument8 = new MusicalInstruments("Flute","Windinstrument","Pink",2000);
   System.out.println(instrument8.name+" "+instrument8.type+" "+instrument8.color+" "+instrument8.price);
   System.out.println(" ");

   MusicalInstruments instrument9 = new MusicalInstruments("Tuba","Windinstrument","Golden",30000);
   
   System.out.println(instrument9.name+" "+instrument9.type+" "+instrument9.color+" "+instrument9.price);
   System.out.println(" ");   
  
  }

}