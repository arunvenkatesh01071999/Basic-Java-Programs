package superandthis;

public class Lion extends Animal{
		int food=1000;
		
    void eat(){
			System.out.println(food);
			System.out.println(this.food);//use for current class
			System.out.println(super.food); //use for parent class
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Lion a = new Lion();
		a.eat();
		
		
	}

}
