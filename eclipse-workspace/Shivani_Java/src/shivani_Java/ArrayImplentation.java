package shivani_Java;

public class ArrayImplentation {
	
	static int[] number;
	static int size;
	
	public ArrayImplentation() {
		this.number = new int[5];
		this.size = 0;
	}
	
	public static void add(int value) {
		if (size == number.length) {
			int[] newNum = new int[number.length*2];
			for (int i=0; i<size; i++) {
				newNum[i] = number[i];
			}
		number = newNum;
		}
		number[size] = value;
		size++;
	}
	
	
	public static int get(int index) {
		if(index == number.length) {
			System.out.println("Invalid index");
			return 0;
		}
		return number[index];
	}
	public static void printList() {
		System.out.print("[");
		for (int i=0; i<size; i++) {
			
			System.out.print(number[i]);
			
			if (i < size-1) {
				System.out.print(", ");
			}
		}
		System.out.println("]");
	}
}
	