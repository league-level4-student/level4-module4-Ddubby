package Checkpoint;



public class Runner {
	public static void main(String[] args) {
		Cake[] cakes = new Cake[20];
		for (int i = 0; i < cakes.length; i++) {
			cakes[i].setName("Order");
			cakes[i].setRate(1.20);
		}
	}
}
