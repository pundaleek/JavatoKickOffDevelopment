package corejava;

public class StroringMethodIntoVariable {

	public static void main(String[] args) {
		new StroringMethodIntoVariable().m3();
	}

	public int m1(){
		int i = 10;
		return i;
	}

	String m2(){
		String s = "appu";
		return s;
	}

	void m3(){
		int r = m1();
		String str = m2();
		System.out.println(r + 10);
		System.out.println(str + " b h");
	}

	CustomDataType m4(){

	}
}

class CustomDataType{


}