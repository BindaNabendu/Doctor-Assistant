package writePrescription;

public class Test {
	
	//variable declaration
	private String testName;
	private String subName;
	private String testCenter;
	private String notes;
	private boolean flagSwitch;
	
	//generate constructor--------------------------------------------
	
	public Test(String testName, String subName, String testCenter, String notes) {
		super();
		this.testName = testName;
		this.subName = subName;
		this.testCenter = testCenter;
		this.notes = notes;
		flagSwitch=true;
	}

	//getters and setters-----------------------------------------------
	public String getTestName() {
		return testName;
	}

	public void setTestName(String testName) {
		this.testName = testName;
	}

	public String getSubName() {
		return subName;
	}

	public void setSubName(String subName) {
		this.subName = subName;
	}
	
	
	
	
}
