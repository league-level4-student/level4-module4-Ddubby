package Checkpoint;

public class orderCake extends Cake {

	private int weight;
	private int rate;
	
	public orderCake(String n, double r) {
		super(n, r);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calcPrice() {
		// TODO Auto-generated method stub
		return rate*weight;
	}
	
	public void setWeight(int w) {
		this.weight = w;
	}
	
	public int getWeight() {
		return weight;
	}

}
