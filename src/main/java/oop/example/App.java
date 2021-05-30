package oop.example;

import java.util.Calendar;
import java.util.Scanner;
public class App 
{
    public static void main( String[] args )
    {
        int age;
        int yearsLeft;
        int yearToRetire;
        int  currentYear = Calendar.getInstance().get(Calendar.YEAR);
        Scanner input = new Scanner(System.in);

        System.out.printf("What is your current age? ");
        age = Integer.parseInt(input.nextLine());
        System.out.printf("At what age would you like to retire? ");
        yearToRetire = Integer.parseInt(input.nextLine());

        System.out.printf("You have %d years left until you can retire.\n", (yearToRetire - age));
        System.out.printf("It's %d, so you can retire in %d.\n", currentYear, (currentYear+(yearToRetire-age)));





    }
}
