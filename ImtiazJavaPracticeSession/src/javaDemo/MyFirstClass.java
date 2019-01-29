package javaDemo;

public class MyFirstClass {
	public static void main(String[] args) {
		String myVar;
		myVar = "Hello it's a beutiful";
		
		myVar = "100" + "100";
		
		int myNumb = 100;
		
//		System.out.println(myNumb + myNumb);
		
		int myVar2 = sumThese(100, 200);
		System.out.println(myVar2);
		
	}
	
	static void prontHello(){
		
		System.out.println("Helo there....");
	}
	
	static int sumThese(int firstArg, int secondArg){
		return firstArg + secondArg;
	}

}