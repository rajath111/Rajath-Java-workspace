package innerClasses;

class Popcorn {
	void taste() {
		System.out.println("The taste is Salty!");
	}
	void price() {
		System.out.println("The price is Rs. 50!!");
	}
}

public class AnonymousInnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Popcorn p1salty = new Popcorn();     //Popcorn object
		
		Popcorn p2spice = new Popcorn() {    //Popcorn extended spicy
			void taste() {
				System.out.println("The taste is Spicy!!");
			}
		};
		
		Popcorn p3sweet = new Popcorn() {    //Popcorn extended Sweety
			void taste() {
				System.out.println("The taste id Sweet!!");
			}
		};
		
		p1salty.taste();
		p1salty.price();
		System.out.println(p1salty.getClass().getName());
		System.out.println();
		
		p2spice.taste();
		p2spice.price();
		System.out.println(p2spice.getClass().getName());
		System.out.println();
		
		p3sweet.taste();
		p3sweet.price();
		System.out.println(p3sweet.getClass().getName());
		System.out.println();
		
	}

}
