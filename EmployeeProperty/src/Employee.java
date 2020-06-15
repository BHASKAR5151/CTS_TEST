class Employee {
	private long empID;
	private String empName;
	private String contactNo;

	Employee(long empID, String empName, String contactNo) {
		this.empID = empID;
		this.empName = empName;
		this.contactNo = contactNo;
	}

	public long getEmpID() {
		return empID;
	}

	public String getEmpName() {
		return empName;
	}

	public String getContactNo() {
		return contactNo;
	}

}