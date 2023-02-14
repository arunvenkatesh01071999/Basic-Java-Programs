package interface1;

public class Workers implements Officerules,Home_rules {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Workers obj = new Workers();
		
		//it is a dynamic binding......
		Home_rules home = new Workers();
		
		obj.maintainhours();
		obj.relocate();
		obj. report();
		System.out.println(Workers.TEACUB);
		obj.drinkwater();
		obj.eatfood();
		home.drinkwater();
	}
	
	public void maintainhours() {
		System.out.println("8 hours");
	}
	public void relocate() {
		System.out.println("bangalur");
	}
	public void report() {
		System.out.println("manager");
	}
	public void drinkwater() {
		System.out.println("3 litter");
	}
	public void eatfood() {
		System.out.println("3 times");
	}

}
