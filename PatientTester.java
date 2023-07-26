class PatientTester{
public static void main(String cos[]){
 Patient patient = new Patient();
 patient.setPatientId(1);
 patient.setPatientName("Pallavi");
 patient.setAge(25);
 patient.setBloodGroup("A+");
 patient.setGender("Female");
 patient.setAddress("Vijaynagar");
 patient.setContactNo(9976565365L);
 patient.setWardNo(28);
 patient.setAttenderName("Sangeetha");
 patient.setDiseaseName("Cancer");
 patient.setConsultant("Prathap");
 patient.setHospitalName("Saiyiranga");
 patient.setFees(1000.00);
 
 
 System.out.println(patient.getPatientId()+ " " + patient.getPatientName() + " " + patient.getAge()+ " "+ patient.getBloodGroup()+ " "+ 
      patient.getGender()+ " " + patient.getAddress() + " " + patient.getContactNo()+ " " + patient.getWardNo()+ " " +
	  patient.getAttenderName()+ " " + patient.getDiseaseName()+ " " + patient.getConsultant()+ " " + patient.getHospitalName()
	   + " " + patient.getFees());
	     
}
}