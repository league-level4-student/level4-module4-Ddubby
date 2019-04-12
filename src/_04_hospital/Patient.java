package _04_hospital;

import java.util.ArrayList;

public class Patient extends Hospital {
	private ArrayList<Doctor> doctors = new ArrayList<Doctor>();
	private ArrayList<Patient> patients = new ArrayList<Patient>();
	private boolean cared = false;
	
	public boolean feelsCaredFor() {
		// TODO Auto-generated method stub
		return cared;
	}

	public void checkPulse() {
		// TODO Auto-generated method stub
		cared = true;
	}


	

}
