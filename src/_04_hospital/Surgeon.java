package _04_hospital;

import java.util.ArrayList;

public class Surgeon extends Doctor {
	private ArrayList<Doctor> doctors = new ArrayList<Doctor>();
	private ArrayList<Patient> patients = new ArrayList<Patient>();
	public boolean performsSurgery() {
		// TODO Auto-generated method stub
		return true;
	}
	
	public boolean makesHouseCalls() {
		// TODO Auto-generated method stub
		return false;
	}
}
