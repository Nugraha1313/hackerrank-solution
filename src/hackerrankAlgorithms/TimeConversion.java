package hackerrankAlgorithms;
/*
 * @created 26/05/2022 on 4:12
 * @project Hackerrank
 * @author Nugraha1313
 */

import java.util.Scanner;

public class TimeConversion {

    public static String timeConversion(String s) {
        String[] listTime = s.split(":");
        //07:05:45PM
        String hour = listTime[0];
        String minute = listTime[1];
        String second = listTime[2].substring(0,2);
        String meridiem = listTime[2].substring(2,4);

        if(meridiem.equals("AM")) {
            if(hour.equals("12"))
                hour = "00";
        }
        else {
            if(!hour.equals("12")) {
                int convertHour = Integer.parseInt(hour);
                convertHour += 12;
                hour = String.valueOf(convertHour);
            }
        }
        return (hour + ":" + minute + ":" + second);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String time = scan.next();
        scan.close();
        System.out.println(timeConversion(time));

    }
}
