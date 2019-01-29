package practice.strings;

public class StringPractice_2 {

	public static void main(String[] args) {

		boolean hungry = (3<5);
		boolean check = 7<4;
		
		if (getValue()) {
			System.out.println("pigout!");
		} else if (hungry == false) {
			System.out.println("I'm already full!!");
		} else {
			System.out.println("I'm sleeping don't care about hunger!!");
		}

	}
	
	public static boolean getValue(){
		return (1>3) && ((5>3) || (7<1));
	}
}