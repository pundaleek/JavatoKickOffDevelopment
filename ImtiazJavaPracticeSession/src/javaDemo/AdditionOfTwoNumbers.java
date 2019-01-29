package javaDemo;

public class AdditionOfTwoNumbers {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 100;
		int sum1 = num1 + num2;
		
		System.out.println(sum1);
		
		AdditionOfTwoNumbers additionOfTwoNumbers = new AdditionOfTwoNumbers();
		additionOfTwoNumbers.additionOfNumbers();
		
		additionOfTwoNumbers.addition();
		int i = 111;
		int k = i + additionOfTwoNumbers.addition();
		System.out.println("k value: "+k);
		
		additionOfTwoNumbers.additionWithParameters(1234, 4321);
		additionOfTwoNumbers.additionWithParameters(1000, 2000);
	}
	
	void additionOfNumbers(){
		int num1 = 100;
		int num2 = 200;
		int num3 = 300;
		int sum = num1 + num2 + num3;
		
		System.out.println("additionOfNumbers: "+sum);
	}
	
	int addition(){
		int num1 = 11;
		int num2 = 22;
		int sum = num1 + num2;
		System.out.println("addition method with return: "+sum);
		return sum;
	}
	
	int additionWithParameters(int i, int j){
		int sumWithParameter = i + j;
		System.out.println("Parameter: "+sumWithParameter);
		return sumWithParameter;
	}
}