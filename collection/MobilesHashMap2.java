package collection;
import java.util.Comparator;
public class MobilesHashMap2 {
	String brand;
	int ram,price;
	public  MobilesHashMap2(String brand,int ram,int price) {
		this.brand=brand;
		this.ram=ram;
		this.price=price;
	}
	public String toString() {
		return " "+this.brand +":"+this.ram+":"+this.price;
	}
	
}
