package practice.strings;

public class ForLoopDemo {

	public static void main(String[] args) {
		int counter = 0;
		for (int idx = 0; idx < 1000; idx++) {
			for (int j = 0; j < 1000; j++) {
				System.out.println("The value of idx was " + idx + "----" + j);
				counter++;
			}
		}
		System.out.println("COUNTER: "+counter);
	}
}