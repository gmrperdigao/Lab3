package Q1.pubV0;

public class GinTonica {

	private int price;
	
	private void calculatePrice() {
		GreenStuff green = new GreenStuff();
		Gin gin = new Gin();
		TonicWater tw = new TonicWater();
		this.price = gin.getPrice() + tw.getPrice() + green.getPrice();
	}
	
	public int getPrice() {
		this.calculatePrice();
		return this.price;
	}

}
