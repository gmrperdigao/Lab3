package Q1.pubV0;

public class DrinksPrice {

	private String nome;
	private static final String ONE_BEER = "hansa";
    private static final String ONE_CIDER = "grans";
    private static final String A_PROPER_CIDER = "strongbow";
    private static final String GT = "gt";
    private static final String BACARDI_SPECIAL = "bacardi_special";
    
    public DrinksPrice(String nome) {
		this.nome = nome;
	}
    
	public int TellPrice() {
		int price;
		if (this.nome.equals(ONE_BEER)) {
			Beer beer = new Beer();
            price = beer.getPrice();
        }
        else if (this.nome.equals(ONE_CIDER)) {
        	Cider cider =  new Cider();
            price = cider.getPrice();
        }
        else if (this.nome.equals(A_PROPER_CIDER)) {
        	ProperCider pcider =  new ProperCider();
            price = pcider.getPrice();
        }
        else if (this.nome.equals(GT)) {
        	GinTonica gt =  new GinTonica();
            price = gt.getPrice();
        }
        else if (this.nome.equals(BACARDI_SPECIAL)) {
        	Bacardi bacardi =  new Bacardi();
            price = bacardi.getPrice();
        }
        else {
            throw new RuntimeException("No such drink exists");
        }
		return price;
	}
}
