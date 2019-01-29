package practice.strings;

public class RecursionDollor {

	public static void main(String[] args) {
		System.out.println(allDollors("hello")); 	//h$e$l$l$o
		System.out.println(allDollors("there"));	//t$h$e$r$e
	}

	public static String allDollors(String str){
		if (str.length() <= 1) {
			return str;
		}

		return str.charAt(0) + "$" + allDollors(str.substring(1));
	}

}
