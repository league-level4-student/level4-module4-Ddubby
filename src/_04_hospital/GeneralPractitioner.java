package _04_hospital;

import java.util.ArrayList;

public class GeneralPractitioner extends Doctor {
	private ArrayList<Doctor> doctors = new ArrayList<Doctor>();
	private ArrayList<Patient> patients = new ArrayList<Patient>();
	
	public boolean makesHouseCalls() {
		// TODO Auto-generated method stub
		return true;
	}
	
	public void assignPatient(Patient patient) {
		// TODO Auto-generated method stub
		patients.add(patient);
	}
	
	public ArrayList<Patient> getPatients() {
		// TODO Auto-generated method stub
		return patients;
	}
	
	public void doMedicine() {
		// TODO Auto-generated method stub
		for (Patient patient : patients) {
			//Lazy way
			patient.checkPulse();
		}
	}
}
