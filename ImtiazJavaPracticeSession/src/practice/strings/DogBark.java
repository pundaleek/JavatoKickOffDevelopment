package practice.strings;

// We are in a trouble if the dog is bark before 7 or after 20.
public class DogBark {
	
	public static void main(String[] args) {
		System.out.println(dogTrouble(true,  6));  
		System.out.println(dogTrouble(true, 7)); 
		System.out.println(dogTrouble(false, 6));
//		System.out.println(dogTrouble(false, 22));
		
	}
	
	public static boolean dogTrouble(boolean barking, int hour){
		
		/*if (barking) {
			if (hour < 7 || hour >20) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}*/
		
		return (barking && (hour < 7 || hour >20));
		
	}

}