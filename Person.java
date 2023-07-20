class Person{
	public Person(){
		System.out.println("Invoking default Person constructor");
	}

 String name;
 String gender;
 String type;
 int age;
 
 public Person(String name,String gender,String type,int age){
	 this.name=name;
	 this.gender=gender;
	 this.type=type;
	 this.age=age;
	 System.out.println("Person constructor is invoked");
	 System.out.println("Person works hard");
 }
}