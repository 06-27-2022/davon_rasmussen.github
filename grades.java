
public class grades {

	public static void main(String[] args) {
		int [] arr = {95, 85, 62, 40, 79}; 
		String [] subjects = {"Math: ", "English: ", "Science: ", "History: ", "Art: "};
		for (int i = 0; i < arr.length; i++) {
			
			if(arr[0] == 95) {
				System.out.println(subjects[0] + "A");
			}
			if(arr[1] == 85) {
				System.out.println(subjects[1] + "B");
			}
			if(arr[2] == 62) {
				System.out.println(subjects[2] + "D");
			}
			if(arr[3] == 40) {
				System.out.println(subjects[3] + "F");
			}
			if(arr[4] == 79) {
				System.out.println(subjects[4] + "C");
				break;
			}
			
		}

	}
	
	

}
