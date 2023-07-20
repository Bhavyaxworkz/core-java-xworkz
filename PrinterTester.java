class PrinterTester{

 public static void main(String print[]){
	 
	Printer printer = new Printer("HP DeskJet","Single function",4699,"Japan");
	System.out.println(printer.name+" "+printer.type+" "+printer.price+" "+printer.origin);
	System.out.println(" ");
	
	Printer printer1 = new Printer("Canon MG2570S","Multi function",2118,"china");
	System.out.println(printer1.name+" "+printer1.type+" "+printer1.price+" "+printer1.origin);
	System.out.println(" ");
	
	Printer printer2 = new Printer("HP smart tank","Multi function",10749,"Thailand");
	System.out.println(printer2.name+" "+printer2.type+" "+printer2.price+" "+printer2.origin);
	System.out.println(" ");
	
	Printer printer3 = new Printer("Epson","Multi function",12149,"Philippines");
	System.out.println(printer3.name+" "+printer3.type+" "+printer3.price+" "+printer3.origin);
	System.out.println(" ");
	
	Printer printer4 = new Printer("brother","Single function",9939,"Vietnam");
	System.out.println(printer4.name+" "+printer4.type+" "+printer4.price+" "+printer4.origin);
	System.out.println(" ");
	
	Printer printer5 = new Printer("Hp laserjet","Multi function",8643,"Malaysia");
	System.out.println(printer5.name+" "+printer5.type+" "+printer5.price+" "+printer5.origin);
	System.out.println(" ");
	
	Printer printer6 = new Printer("Canon E4570 all in one", "Multi function",7615,"Italy");
	System.out.println(printer6.name+" "+printer6.type+" "+printer6.price+" "+printer6.origin);
	System.out.println(" ");
	
	Printer printer7 = new Printer("Canon PIXMA","Multi function",8745,"US");
	System.out.println(printer7.name+" "+printer7.type+" "+printer7.price+" "+printer7.origin);
	System.out.println(" ");
	
	Printer printer8 = new Printer("Pantum monochrome laser","Single function",7465,"Japan");
	System.out.println(printer8.name+" "+printer8.type+" "+printer8.price+" "+printer8.origin);
	System.out.println(" ");
	
	Printer printer9 = new Printer( "Brother DCP","Multi function",12355,"UK");
	System.out.println(printer9.name+" "+printer9.type+" "+printer9.price+" "+printer9.origin);
	System.out.println(" ");
	 
 }

}