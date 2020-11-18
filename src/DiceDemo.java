public class DiceDemo {

  public static void main(String[] args) {

    /*
    System.out.println(rollDice());
    System.out.println(rollDice());
    System.out.println(rollDice());
    System.out.println(rollDice());
    */

    int p1 = rollDice();
    System.out.println(p1);
    int p2 = rollDice();
    System.out.println(p2);

    System.out.println("same pips ? "+ samePips(p1,p2));
    System.out.println("same pips for 3 ?" + samePipsNumber(p1,p2,3));

    //wir wollen öfters würfeln bis irgendein ereignis eintritt -> schleifen
    //z.b. wie oft muss gewürfelt werden damit 2x die sechs kommt?
  }

  /**
   * This method simulates the roll of a dice.
   * @return int the pips (1..6) of the dice
   */
  public static int rollDice() {
    //Math.random() liefert double > 0.0 and < 1.0
    return (int)(Math.random()*6)+1;
  }

  public static boolean samePips(int pips1, int pips2) {
    return pips1 == pips2;
  }

  public static boolean samePipsNumber(int pips1, int pips2, int which) {
    return pips1 == which && pips2 == which;
  }




}
