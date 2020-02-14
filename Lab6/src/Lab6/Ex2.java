package Lab6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex2 {

    static void menu(){
        System.out.println("\n*Research assistant hours calculator*\n" +
                "1. Enter hours\n" +
                "2. Exit\n" +
                "*************************************");

    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = 1;
        int assistant_count = 1;
        double hours = 0.0;
        double average_hours = 0.0;
        int average_count = 0;

        menu();
        int user_choice = in.nextInt();

        while (user_choice != 2){
            System.out.printf("Please enter the hours for assistant: #%d%n", assistant_count);
            while (count < 6){
                System.out.printf("Please enter your average hours for day: #%d", count);
                double input = in.nextDouble();
                hours = hours + input;
                count ++;
            }

            average_hours = hours / 5;

            System.out.printf("The average number of hours worked by student %d is %.2f%n", assistant_count, average_hours);

            if (average_hours > 6){
                average_count ++;
            }

            menu();
            user_choice = in.nextInt();
            assistant_count ++;
            count = 1;
            hours = 0.0;

        }

        System.out.printf("The number of students who work over 6 hours a day is: %d", average_count);
    }
}
