package Checkpoint;

public abstract class Cake {
	protected String name;
	protected double rate;

	public Cake(String n, double r) {
		name = n;
		rate = r;
	}

	public abstract double calcPrice();

	public String toString() {
		return name + "\t" + rate;
	}

	public void setRate(double r) {
		this.rate = r;
	}

	public void setName(String n) {
		this.name = n;
	}
	
	public double getRate() {
		return rate;
	}
	
	public String getName() {
		return name;
	}
}
