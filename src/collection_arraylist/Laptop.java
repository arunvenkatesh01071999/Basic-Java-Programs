package collection_arraylist;

public class Laptop {
	String model;
	int price;
	int gb;
	boolean touch;
	
	public String toString()
	{
			return this.model+"-"+this.price+"-" +this.gb+"-"+this.touch;
	}
	public Laptop(String model,int price,int gb, boolean touch) {
		this.model=model;
		this.price=price;
		this.gb=gb;
		this.touch=touch;
	}

}
