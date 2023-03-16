package javaeight;

import java.util.stream.Stream;

public class StreamExample {

	public static void main(String[] args) {
		
		Stream<Integer> myStream=Stream.of(1,2,3,4,5,6);
		myStream.forEach(myData -> System.out.println(myData));
		
		Integer myArray[]  = new Integer[] {1,2,3,4,5,6,7};
		Stream<Integer>  myStream2 =Stream.of(myArray);
		
		myStream2.forEach(myData2 -> System.out.println(myData2));
	}

}
