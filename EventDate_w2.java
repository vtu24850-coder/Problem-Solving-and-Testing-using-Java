

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Event_w2 {
    public static String findDay(int month, int day, int year) {
        
        Calendar cal = Calendar.getInstance();
        cal.set(year, month - 1, day);

        int dow = cal.get(Calendar.DAY_OF_WEEK); 

        switch (dow) {
            case Calendar.SUNDAY:
                return "SUNDAY";
            case Calendar.MONDAY:
                return "MONDAY";
            case Calendar.TUESDAY:
                return "TUESDAY";
            case Calendar.WEDNESDAY:
                return "WEDNESDAY";
            case Calendar.THURSDAY:
                return "THURSDAY";
            case Calendar.FRIDAY:
                return "FRIDAY";
            case Calendar.SATURDAY:
                return "SATURDAY";
        }
        return "";

    }

}

public class EventDate_w2 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("output.txt");

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int month = java.lang.Integer.parseInt(firstMultipleInput[0]);

        int day = java.lang.Integer.parseInt(firstMultipleInput[1]);

        int year = java.lang.Integer.parseInt(firstMultipleInput[2]);

        String res = Event_w2.findDay(month, day, year);

        bufferedWriter.write(res);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}