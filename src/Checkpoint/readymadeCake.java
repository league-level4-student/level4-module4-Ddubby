package Checkpoint;

public class readymadeCake extends Cake {

	private int quantity;
	private int rate;
	
	public readymadeCake(String n, double r) {
		super(n, r);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calcPrice() {
		// TODO Auto-generated method stub
		return quantity*rate;
	}
	
	public void setQuantity(int q) {
		this.quantity = q;
	}
	
	public int getQuantity() {
		return quantity;
	}

}
