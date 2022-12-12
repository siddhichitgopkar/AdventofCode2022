import java.io.*;
import java.util.*;

public class Day2 {
    public static void main(String[] args) throws Exception {
        int output = 0;
        String input = "input.txt";
        String i = "";
        HashMap <String, Integer> map = new HashMap<String, Integer>();

        map.put("A X", 3);
        map.put("A Y", 6);
        map.put("A Z", 0);

        map.put("B X", 0);
        map.put("B Y", 3);
        map.put("B Z", 6);

        map.put("C X", 6);
        map.put("C Y", 0);
        map.put("C Z", 3);

        File fileinput = new File(input);
        Scanner sc = new Scanner(fileinput);
        while (sc.hasNextLine()) {
            i = sc.nextLine();
            output += (((i.charAt(2) - 'X' ) + 1) + map.get(i));
        } //while
        System.out.println(output);
    } //main
} //Day1


/*
  import java.io.*;
import java.util.*;

public class Day2 {
    public static void main(String[] args) throws Exception {
        int output = 0;
        String input = "input.txt";
        String i = "";
        HashMap <String, Integer> map = new HashMap<String, Integer>();

        map.put("A X", 3);
        map.put("A Y", 6);
        map.put("A Z", 0);

        map.put("B X", 0);
        map.put("B Y", 3);
        map.put("B Z", 6);

        map.put("C X", 6);
        map.put("C Y", 0);
        map.put("C Z", 3);

        File fileinput = new File(input);
        Scanner sc = new Scanner(fileinput);
        while (sc.hasNextLine()) {
            i = sc.nextLine();
            output += (((i.charAt(2) - 'X' ) + 1) + map.get(i));
        } //while
        System.out.println(output);
    } //main
} //Day1
*/
