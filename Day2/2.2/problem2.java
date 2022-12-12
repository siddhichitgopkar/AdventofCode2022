/*
  --- Part Two ---
  The Elf finishes helping with the tent and sneaks back over to you. "Anyway, the second
  column says how the round needs to end: X means you need to lose, Y means you need to end the
  round in a draw, and Z means you need to win. Good luck!"

  The total score is still calculated in the same way, but now you need to figure out what shape
  to choose so the round ends as indicated. The example above now goes like this:

  In the first round, your opponent will choose Rock (A), and you need the round to end in a draw
  (Y), so you also choose Rock. This gives you a score of 1 + 3 = 4.
  In the second round, your opponent will choose Paper (B), and you choose Rock so you lose (X)
  with a score of 1 + 0 = 1.
  In the third round, you will defeat your opponent's Scissors with Rock for a score of 1 + 6 = 7.
  Now that you're correctly decrypting the ultra top secret strategy guide,
  you would get a total score of 12.

  Following the Elf's instructions for the second column, what would your total
  score be if everything goes exactly according to your strategy guide?
*/

import java.io.*;
import java.util.*;

public class problem2 {

    public static void main(String[] args) throws Exception {

        int output = 0;
        String input = "input.txt";
        String i = "";
        HashMap <String, Integer> map = new HashMap<String, Integer>();

        map.put("A X", 0 + 3);
        map.put("A Y", 3 + 1);
        map.put("A Z", 6 + 2);

        map.put("B X", 0 + 1);
        map.put("B Y", 3 + 2);
        map.put("B Z", 6 + 3);

        map.put("C X", 0 + 2);
        map.put("C Y", 3 + 3);
        map.put("C Z", 6 + 1);

        File fileinput = new File(input);
        Scanner sc = new Scanner(fileinput);
        while (sc.hasNextLine()) {
            i = sc.nextLine();
            output += map.get(i);
        } //while
        System.out.println(output);
    } //main
} //problem2
