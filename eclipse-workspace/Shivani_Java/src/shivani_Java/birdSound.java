package shivani_Java;

//package polymorphism;
//
//import polymorphism.Sparrow;
//import polymorphism.bird;

class bird {
	public void sing() {
		System.out.println("Tweet Tweet Tweet");
	}
}
class Parrot extends bird {	//Inheritance 
	public void sing(String song) {
		System.out.println("Kwee Kwee Kwee");
	}
}
class Sparrow extends bird {
	public void sing(int a) {
		System.out.println("Stweek Stweek Stweek");
	}
}


public class birdSound {
	
	public static void main(String[] args) {
	
		Sparrow p = new Sparrow(); // polymorphism... can change constructor ad get output
		p.sing(1);
	}

}

