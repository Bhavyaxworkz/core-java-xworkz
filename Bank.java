class Bank{
// bankId,bankName,branch,branchCode,address,helplineNo,branchManager,
//ifscCode,miscCode,noOfLockers,noOfEmployees,timings,websiteDetailes,
private int bankId;
private String bankName;
private  String branch;
private int branchCode;
private String address;
private long helplineNo;
private String branchManager;
private String ifscCode;
private String miscCode;
private int noOfLockers;
private int noOfEmployees;
private String timings;
private String websiteDetails;

   public void setBankId(int bankId){
     this.bankId = bankId;
}
     public int getBankId(){
       return bankId;
}
  public void setBankName(String bankName){
	  this.bankName =bankName;
  }
public String getBankName(){
	return bankName;
}
public void setBranch(String branch){
	  this.branch =branch;
  }
public String getBranch(){
	return branch;
}
public void setBranchCode(int branchCode){
	  this.branchCode = branchCode;
  }
public int getBranchCode(){
	return branchCode;
}
public void setAddress(String address){
	  this.address = address;
  }
public String getAddress(){
	return address;
}
public void setHelplineNo(long helplineNo){
	  this.helplineNo = helplineNo;
  }
public long getHelplineNo(){
	return helplineNo;
}
public void setBranchManager(String branchManager){
	  this.branchManager = branchManager;
  }
public String getBranchManager(){
	return branchManager;
}
public void setIfscCode(String ifscCode){
	  this.ifscCode = ifscCode;
  }
public String getIfscCode(){
	return ifscCode;
}
public void setMiscCode(String miscCode){
	  this.miscCode = miscCode;
  }
public String getMiscCode(){
	return miscCode;
}
public void setNoOfLockers(int noOfLockers){
	  this.noOfLockers = noOfLockers;
  }
public long getNoOfLockers(){
	return noOfLockers;
}

public void setNoOfEmployees(int noOfEmployees){
	  this.noOfEmployees = noOfEmployees;
  }
public long getNoOfEmployees(){
	return noOfEmployees;
}
public void setTimings(String timings){
	  this.timings = timings;
  }
public String getTimings(){
	return timings;
}
public void setWebsiteDetails(String websiteDetails){
	  this.websiteDetails = websiteDetails;
  }
public String getWebsiteDetails(){
	return websiteDetails;
}










}