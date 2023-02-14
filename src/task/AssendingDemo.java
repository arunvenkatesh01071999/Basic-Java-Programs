package task;

import java.util.Comparator;

public class AssendingDemo implements Comparator<Object> {


	@Override
	public int compare(Object c1, Object c2) {
		Mobiles m1 = (Mobiles) c1;
		Mobiles m2 = (Mobiles) c2;

		if (m1.mobPrice > m2.mobPrice) {
			return 2;
		}
		else if (m1.mobPrice < m2.mobPrice) {
			return -2;
		} else
			return 0;

	}
	
}
