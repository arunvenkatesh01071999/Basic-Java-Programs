package inheritance;

class Father {
	void house() {
		System.out.println("2 bhk house");
	}
}
class Son extends Father{
	void car() {
		System.out.println("Swift car");
	}
}

class Single{
	public static void main(String []args) {
		Son myObj = new Son();
		myObj.car();
		myObj.house();
}
}

