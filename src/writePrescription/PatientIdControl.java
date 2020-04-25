package writePrescription;

import java.io.*;

import java.util.Scanner;

public class PatientIdControl {
	private Scanner idScan;
	private int patientIdSrorer;
	
	public PatientIdControl() {
		super();
		patientIdSrorer = 0000;
	}

	private File doctorsLastPatientId = new File("F:/softwareDevelopment/Doctor-Assistant/PatientDatabase/idCallBack.id");

//-----------this method for store id---------------in idCallback.id file--------------------
	public void setLastPatientId(int patientId) {
		
		FileWriter idWriter;
		try {
			idWriter = new FileWriter(doctorsLastPatientId);
			idWriter.write(patientId);
			idWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	//--------this method for read id---------from idCallBack.id file---------------------
	public int getLastPatientId() {
		FileReader idReader;
		try {
			idReader=new FileReader(doctorsLastPatientId);
			idScan=new Scanner(idReader);
			patientIdSrorer=idScan.nextInt();
			try {
				idReader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return patientIdSrorer;
	}
	
}
