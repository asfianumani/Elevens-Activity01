/**
 * This is a class that tests the Card class.
 */
public class CardTester {

 /**
  * The main method in this class checks the Card operations for consistency.
  * @param args is not used.
  */
 public static void main(String[] args) {
  /* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
   Card card=new Card("Hearts", "One", 1);
   Card card1=new Card("Hearts", "Two", 1);
   System.out.println(card.matches(card1));
   System.out.print(card.toString());
   
 }
}
