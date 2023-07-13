class Modulus1{
  
 
  public static void main(String Modulus[]){
  
	mod(400,151);
	mod(819,617);
	mod(900,990);
	mod(788,567);
	mod(485,300);
	mod(353,133);
	mod(278,179);
	mod(269,174);
	mod(990,273);
	mod(48,27);
	System.out.println(" ");
	
	mod(600,256,45);
	mod(690,67,66);
	mod(670,190,53);
	mod(785,590,34);
	mod(495,565,245);
	mod(763,833,23);
	mod(868,479,65);
	mod(808,408,77);
	mod(930,273,23);
	mod(506,27,24);
	
  
  }
  
  public static void mod(int a, int b){
	  System.out.println(a%b);
  }
  public static void mod(int a, int b, int c){
	  System.out.println(a%b%c);
  }
  
  }