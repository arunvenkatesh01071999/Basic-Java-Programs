package task;

public class Mobiles {

	String mobName;
	int mobRam;
	int mobStorage;
	int mobPrice;

	@Override
	public String toString() {
		return " " + this.mobName + "-" + this.mobRam + "-" + this.mobStorage + "-" + this.mobPrice;
	}
	public Mobiles(String mobName, int mobRam, int mobStorage, int mobPrice) {
		this.mobName = mobName;
		this.mobRam = mobRam;
		this.mobStorage = mobStorage;
		this.mobPrice = mobPrice;
	}

}
