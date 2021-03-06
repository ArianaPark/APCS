/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		Card c1 = new Card("2","Club",2);
		Card c2 = new Card("2","Club",2);
		Card c3 = new Card("King","Spade",13);
		System.out.println(c1.matches(c2));
		System.out.println(c1.matches(c3));
		System.out.println(c3.matches(c2));
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		System.out.println(c3.toString());
	}
}
