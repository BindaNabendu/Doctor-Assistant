package writePrescription;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Prescription {
	
	//veriable decleration
	public int patientId;
	private String patientName;
	private float age;
	private String rx;
	private String note;
	private String tests;
	
	
	//-----Constructor declaration using filed--------------------
	public Prescription() {
		patientId=100000001;
		patientName="Unknown";
		age=0;
		rx="Not to give any medichine yet";
		note="Nothing...";
		tests="Nothing...";
	}
	public Prescription(int patientId, String patientName, float age, String rx, String note,String tests) {
	this.patientId=patientId;
	this.patientName=patientName;
	this.age=age;
	this.rx=rx;
	this.note=note;
	this.tests=tests;
	}
	public Prescription(int patientId, String patientName, float age, String rx, String tests) {
		this.patientId=patientId;
		this.patientName=patientName;
		this.age=age;
		this.rx=rx;
		this.tests=tests;
		}
	public Prescription(int patientId, String patientName, float age, String rx) {
		this.patientId=patientId;
		this.patientName=patientName;
		this.age=age;
		this.rx=rx;
		}
	//---------constructor declaration ended-------------------------------------
	public void showAllDetails() {
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		System.out.println("Patient Id is:"+patientId+"\n");
		System.out.print("Patient Name is:"+patientName+"\t\t");
		System.out.println("Patient age is:"+age+"\n");
		System.out.println("rx \n"+rx);
		System.out.println("---------------------------------------------------------------------------------------------------------");
		System.out.println("Tests are: "+tests);
		System.out.println("---------------------------------------------------------------------------------------------------------");
		System.out.println("Notes: \n"+note);
		System.out.println("============================================================================================");
	}
	//-------work with file types--------------------
	private File prescriptionFileStore=new File("F:/softwareDevelopment/Doctor's Assistant/PatientDatabase/121212.patient");
	public void fileManager() {
		try {
			Scanner fileScanner=new Scanner(prescriptionFileStore);
			while (fileScanner.hasNext()) {
				String tempString =fileScanner.nextLine();
				System.out.println(tempString);
				
				
			}
			
			fileScanner.close();
		} catch (FileNotFoundException e) {
		}
	}
	
}
