package ds.stack;

import java.util.Iterator;

public class App {
	public static void main(String[] args) {
		Stack theStack = new Stack(3);
		/*theStack.push(20);
		theStack.push(40);
		theStack.push(60);
		theStack.push(80);*/
		
		System.out.println(reverseString("OLLEH"));
		
		/*while (!theStack.isEmpty()) {
			long value = theStack.pop();
			System.out.println(value);
		}*/
	}
	
	public static String reverseString(String str){
		
		int stackSize = str.length(); //get the maz stack size
		Stack theStack = new Stack(stackSize); // we make the satck
		
		for (int j = 0; j < str.length(); j++) {
			char ch = str.charAt(j); // getting a char from the input string
			theStack.push(ch);
			
		}
		
		String result = "";
		
		while (!theStack.isEmpty()) {
			char ch = theStack.pop();
			result = result + ch; // appending to the output
		}
		
		return result;
		
	}

}
