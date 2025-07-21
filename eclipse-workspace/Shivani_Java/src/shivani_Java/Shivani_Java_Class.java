package shivani_Java;

public class Shivani_Java_Class
{
	static int[] array = {10,20,30,40,50};
	static int length ;
	static int capacity;
	
	public  Shivani_Java_Class(int capacity) {
	
		this.array = array;
		this.length = length;
		this.capacity = capacity*2;
	}
		public static int[] addingFirst(int index, int ele) {
			
//			int[] newArray = new int[array.length +1];
			for (int i=length-1; i<index; i--) {
				
				array[i] = array[i-1];	
				array[index] = ele;
				
		
			}
//			 array = newArray;
			capacity++;
			return array;
		
		}
		public static void printArray() {
	        if (array == null || array.length == 0) {
	            System.out.println("[]");
	            return;
	        }
	        System.out.print("[");
	        for (int i = 0; i < array.length; i++) {
	            System.out.print(array[i]);
	            if (i < array.length - 1) {
	                System.out.print(", ");
	            }
	        }
	        System.out.println("]");
	    }
	
}
