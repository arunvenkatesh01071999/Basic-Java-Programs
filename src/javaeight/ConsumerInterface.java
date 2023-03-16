package javaeight;

import java.util.function.Consumer;

public class ConsumerInterface {

	public static void main(String[] args)
	{
		// one input 
	     Consumer<String> myConsumer3 = myObject->System.out.println(myObject.toUpperCase());
		myConsumer3.accept("my name is arun");
		
		//consumer is having same data types string string so use and then method
		Consumer<String> myConsumer = myObject->System.out.println(myObject.toUpperCase());
		
		Consumer<String> myConsumer2 = myObject->System.out.println(myObject.toLowerCase());
		
		myConsumer.andThen(myConsumer2).accept("my name is arun");
		
		//
	}

}
