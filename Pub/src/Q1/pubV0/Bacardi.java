package Q1.pubV0;

public class Bacardi {

	private int price;
	
	private void calculatePrice() {
		Rum rum = new Rum();
		Gin gin = new Gin();
		Grenadine gr = new Grenadine();
		LimeJuice lj = new LimeJuice();
		this.price = gin.getPrice() + rum.getPrice() + gr.getPrice() + lj.getPrice();
	}
	
	public int getPrice() {
		this.calculatePrice();
		return this.price;
	}
}
