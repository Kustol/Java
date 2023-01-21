//2. Написать метод, который определяет, является ли год високосным,
// и возвращает boolean (високосный - true, не високосный - false).
// Каждый 4-й год является високосным, кроме каждого 100-го,
// при этом каждый 400-й – високосный.

package HomeWork_1;

import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the year: ");
        int year = iScanner.nextInt();
        CheckYear(year);
    }

    private static void CheckYear(int year) {
        boolean check_year = false;
        if (year > 0) {
            if (year % 4 == 0) {
                check_year = true;
                if (year % 100 == 0) {
                    if (year % 400 == 0)
                        check_year = true;
                    else
                        check_year = false;
                }
            } else check_year = false;
            if (!check_year)
                System.out.println(year + " : Non Leap year");
            else
                System.out.println(year + " : Leap year");
        } else {
            System.out.println("Error!");
        }
    }
}
