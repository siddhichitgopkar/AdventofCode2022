import java.io.*;
import java.util.*;

public class Day1 {
    public static void main(String[] args) throws Exception {

        String input = "input.txt";
        int[] maximum = {0,0,0};
        int temp = 0;
        String i = "";

        File fileinput = new File(input);
        Scanner sc = new Scanner(fileinput);

        while (sc.hasNextLine()) {
            i = sc.nextLine();
            if (i.isEmpty()) {
                if (temp > maximum[0]) {
                    maximum[0] = temp;
                } //if
                Arrays.sort(maximum);
                temp = 0;
            } else {
                temp = temp + Integer.parseInt(i);
            } //else
        } //while
        System.out.println(maximum[0] + maximum[1] + maximum[2]);
    } //main
} //Day1

//Part 1
/*
public class Day1 {
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
} //Day1
*/
