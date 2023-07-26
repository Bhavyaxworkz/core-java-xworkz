class PassportTester{
	public static void main(String args[]){
		Passport passport = new Passport();
		passport.setPassportId(1);
		passport.setName("Chinmayi");
		passport.setDob("21 Jan 2002");
		passport.setBirthPlace("Chikmagalur");
		passport.setNationality("Indian");
	     passport.setAddress("Bypass Chikmagalur");
		passport.setParent("Father");
		passport.setSupportingProof("Aadhar");
		passport.setFees(2000);
		passport.setContactNumber(98765);
		
System.out.println(passport.getPassportId() + " " + passport.getName() + " " + passport.getDob() + " " + 
passport.getBirthPlace() + " " + passport.getNationality() + " " + passport.getAddress() + " " +
passport.getParent() + " " + passport.getSupportingProof() + " " + passport.getFees() + " " + passport.getContactNumber());
		
		Passport passport1 = new Passport();
		passport1.setPassportId(2);
		passport1.setName("Bhavya");
		passport1.setDob("25 Jun 2023");
		passport1.setBirthPlace("Hoskote");
		passport1.setNationality("Indian");
	     passport1.setAddress("Bypass Hoskote");
		passport1.setParent("Mother");
		passport1.setSupportingProof("PAN");
		passport1.setFees(1500);
		passport1.setContactNumber(87623);
		
System.out.println(passport1.getPassportId() + " " + passport1.getName() + " " + passport1.getDob() + " " + 
passport1.getBirthPlace() + " " + passport1.getNationality() + " " + passport1.getAddress() + " " +
passport1.getParent() + " " + passport1.getSupportingProof() + " " + passport1.getFees() + " " + passport1.getContactNumber());
		
		Passport passport2 = new Passport();
		passport2.setPassportId(3);
		passport2.setName("Ramya");
		passport2.setDob("26 July 2022");
		passport2.setBirthPlace("Bangalore");
		passport2.setNationality("Indian");
	     passport2.setAddress("Bypass Bangalore");
		passport2.setParent("Sister");
		passport2.setSupportingProof("Aadhar");
		passport2.setFees(1000);
		passport2.setContactNumber(98655);
		
System.out.println(passport2.getPassportId() + " " + passport2.getName() + " " + passport2.getDob() + " " + 
passport2.getBirthPlace() + " " + passport2.getNationality() + " " + passport2.getAddress() + " " +
passport2.getParent() + " " + passport2.getSupportingProof() + " " + passport2.getFees() + " " + passport2.getContactNumber());
		
		Passport passport3 = new Passport();
		passport3.setPassportId(4);
		passport3.setName("Chithra");
		passport3.setDob("20 Jan 2002");
		passport3.setBirthPlace("Mysore");
		passport3.setNationality("Indian");
	     passport3.setAddress("Bypass Mysore");
		passport3.setParent("Brother");
		passport3.setSupportingProof("VoterId");
		passport3.setFees(2400);
		passport3.setContactNumber(97765);
		
System.out.println(passport3.getPassportId() + " " + passport3.getName() + " " + passport3.getDob() + " " + 
passport3.getBirthPlace() + " " + passport3.getNationality() + " " + passport3.getAddress() + " " +
passport3.getParent() + " " + passport3.getSupportingProof() + " " + passport3.getFees() + " " + passport3.getContactNumber());
		
		Passport passport4 = new Passport();
		passport4.setPassportId(5);
		passport4.setName("Chithanya");
		passport4.setDob("28 Aug 2001");
		passport4.setBirthPlace("Belagavi");
		passport4.setNationality("Indian");
	     passport4.setAddress("Bypass Belagam");
		passport4.setParent("Father");
		passport4.setSupportingProof("Aadhar");
		passport4.setFees(4000);
		passport4.setContactNumber(98755);
		
System.out.println(passport4.getPassportId() + " " + passport4.getName() + " " + passport4.getDob() + " " + 
passport4.getBirthPlace() + " " + passport4.getNationality() + " " + passport4.getAddress() + " " +
passport4.getParent() + " " + passport4.getSupportingProof() + " " + passport4.getFees() + " " + passport4.getContactNumber());
		
		
	}
}