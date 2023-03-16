package javaeight;

import java.util.Optional;

public class OptionalDemo {

	public static void main(String[] args) {

		Optional<String> myName=Optional.ofNullable("ARUN");
		System.out.println(myName.isPresent() ? myName.get():"no name");
	}
	static String names(String myName) {
		return myName;
	}

}
