package practice.strings;

public class IndexOFDemo {
	
	public static void main(String[] args) {
		String str = "Prime Time";
		
		int indexOf = str.indexOf("Time");
		System.out.println(indexOf);
		
		String substring = str.substring(6);
		System.out.println(substring);
		
		String substring2 = str.substring(indexOf, indexOf+4);
		System.out.println(substring2);
		
		while (indexOf <= 6) {
			System.out.println("Value of IndexOf is: "+indexOf);
			indexOf++;
		}
	}
}