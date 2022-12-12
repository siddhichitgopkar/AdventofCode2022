import java.io.*;
import java.util.*;

public class problem1 {
    public static void main(String[] args) throws Exception {

        String input = "input.txt";
        int maximum = 0;
        int temp = 0;
        String i = "";

        File fileinput = new File(input);
        Scanner sc = new Scanner(fileinput);

        while (sc.hasNextLine()) {
            i = sc.nextLine();
            if (i.isEmpty()) {
                if (temp > maximum) {
                    maximum = temp;
                } //if
                temp = 0;
            } else {
                temp = temp + Integer.parseInt(i);
            } //else
        } //while
        System.out.println(maximum);
    } //main
} //problem1
