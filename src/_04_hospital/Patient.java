package _04_hospital;

public class Patient extends Hospital {
	
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
