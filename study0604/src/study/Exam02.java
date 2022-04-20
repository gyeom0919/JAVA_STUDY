package study;

public class Exam02 {

	public static void main(String[] args) {

		int[] array = {1, 5, 3, 8, 2};
		
		int min = array[0];
		int max = array[0];
		
		for(int i = 0;i<array.length;i++) {
			if(min>array[i]) 
				min = array[i];
			if(max<array[i])
				max = array[i];
		}
		System.out.println("min : " + min);
		System.out.println("max : " + max);
			
	}

}
