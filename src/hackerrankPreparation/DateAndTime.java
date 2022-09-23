package hackerrankPreparation;
/*
 * @created 23/05/2022 on 22:29
 * @project Hackerrank
 * @author Nugraha1313
 */

import java.time.LocalDate;
import java.util.Scanner;

public class DateAndTime {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int month = scan.nextInt();
        int day = scan.nextInt();
        int year;

        do {
            year = scan.nextInt();
        } while( !(year > 2000 && year < 3000) );

        LocalDate localDate = LocalDate.of(year, month, day);
        java.time.DayOfWeek dayOfWeek = localDate.getDayOfWeek();
        System.out.println(dayOfWeek.toString());

        scan.close();
    }
}
