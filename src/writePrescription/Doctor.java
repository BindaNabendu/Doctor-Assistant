package writePrescription;

import java.util.Scanner;

public class Doctor {
	private static Scanner systemScanner=new Scanner(System.in);
	private static Prescription doctorPrescription=new Prescription();
 public static void main(String[] args) {
	 int takeInstruction;
	 
	 
	System.out.println("---------------Instruction----------------"
			+ "\n	Press '1' for Write Prescription \n	Press '2' for Find Patient details\n	Press '3' for see or take apointment\n	Press '0' for exit");
	
	takeInstruction=systemScanner.nextInt();
	
	
		while (takeInstruction !=0 ) {

			if (takeInstruction == 1) {
				String tempPatientNameString,rxString,doctorsNotes,doctorRecommandedTest;
				int tempPatientIdReceiver=patientIdGenerator();
				System.out.println("This Patient Id Is:"+tempPatientIdReceiver);
				System.out.println("Please enter your patient name:");
				tempPatientNameString=systemScanner.nextLine();
				
				System.out.println("please enter your patient age:");
				float tempAgeReceiver=systemScanner.nextFloat();
				
				System.out.println("Rx.");
				rxString=systemScanner.nextLine();
				
				System.out.println("Notes:");
				doctorsNotes=systemScanner.nextLine();
				
				System.out.println("Have to take tests yet:");
				doctorRecommandedTest=systemScanner.nextLine();
				
				//have to call doctors constructor after taking all information
				doctorPrescription=new Prescription(tempPatientIdReceiver, tempPatientNameString, tempAgeReceiver, rxString,doctorsNotes,doctorRecommandedTest);
				
				
			} else if (takeInstruction == 2) {
				// TODO find patient details
				//--------------------*********Temporarily use this method ********----------------------------
				doctorPrescription.showAllDetails();
			} else if (takeInstruction == 3) {
				// TODO see of appointment
				
			} else {
				System.out.println("You enter wrong imformation");
			}
			System.out.println("---------------Instruction----------------"
					+ "\n	Press '1' for Write Prescription \n	Press '2' for Find Patient details\n	Press '3' for see or take apointment\n	Press '0' for exit");
			
			takeInstruction=systemScanner.nextInt();
		}
		ScannerClosed();
}
 public static void ScannerClosed() {
	 systemScanner.close();
 }
 private static int patientIdGenerator() {
	 doctorPrescription.patientId+=1;
	 return doctorPrescription.patientId;
 }
}