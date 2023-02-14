package enumarationss;

public enum Country {

	
	INR("INDIA","INR","$"),
	USA("USA","USD","S"),
	EUR("EROPE","EUR","U");
	
	 String contry;
	  String price;
	 String symbol;
	
	Country(String country, String price, String symbol) 
	{
		this.contry=country;
		this.price=price;
		this.symbol=symbol;
	}
}
