package _04_hospital;

import java.util.ArrayList;

public class Hospital {
	private ArrayList<Doctor> doctors = new ArrayList<Doctor>();
	private ArrayList<Patient> patients = new ArrayList<Patient>();

	public void addPatient(Patient patient) {
		// TODO Auto-generated method stub
		patients.add(patient);
	}

	public void addDoctor(GeneralPractitioner doctor) {
		// TODO Auto-generated method stub
		doctors.add(doctor);
	}

	public void addDoctor(Surgeon doctor) {
		// TODO Auto-generated method stub
		doctors.add(doctor);
	}

	public ArrayList<Doctor> getDoctors() {
		// TODO Auto-generated method stub
		return doctors;
	}

	public ArrayList<Patient> getPatients() {
		// TODO Auto-generated method stub
		return patients;
	}

	public void assignPatientsToDoctors() {
		// TODO Auto-generated method stub
		int j = 0;
		for (int i = 0; i < 3; i++) {
			doctors.add(new Doctor());
		}
		for (int i = 0; i < 8; i++) {
			patients.add(new Patient());
		}
		for (Doctor doctor : doctors) {
			for (int i = j; i < patients.size(); i++) {
				try {
					doctor.assignPatient(patients.get(i));
				} catch (DoctorFullException e) {
					// TODO Auto-generated catch block
					if (i == 3) {
						j = 3;
						break;
					} else {
						j = 6;
						break;
					}
				}
			}
		}
	}

}
