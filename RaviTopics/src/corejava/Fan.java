package corejava;

public class Fan{
	
	public static void main(String[] args) {
		new Fan().switchOn();
		new Fan().switchOff();
		new Fan().speedUp();
		new Fan().speedDown();
	}

	public void switchOn(){
		System.out.println("Switch is On");
	}
	
	public void switchOff(){
		System.out.println("Switch if Off");
	}
	
	public void speedUp(){
		System.out.println("Fan speed is up");
	}
	
	public void speedDown(){
		System.out.println("Fan speed is low");
	}
}