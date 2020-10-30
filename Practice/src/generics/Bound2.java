package generics;

class Car<X extends String>{
	X name;
	X place;
	Car(X s1, X s2){
		name = s1;
		place = s2;
	}
	void display() {
		System.out.println("The car name is "+name+" and place is "+place+".");
	}
}


public class Bound2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car<String> car1 = new Car<String>("Audi","Banglore");
		car1.display();
		//Car<Integer> car2 = new Car<Integer>("Audi","Banglore");
	}
}
