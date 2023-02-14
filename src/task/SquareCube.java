package task;

public class SquareCube {
	private int limit;

	public SquareCube(int limit) {
		this.limit = limit;
	}

	public void cube() {
		int i = 1;
		while ((i * i) < limit) {
			System.out.println(i * i + " ");
			i++;
		}
	}

	public void square() {
		int i = 1;
		while ((i * i * i) < limit) {
			System.out.println(" ");
			System.out.println(i * i * i + " ");
			i++;
		}
	}

}
