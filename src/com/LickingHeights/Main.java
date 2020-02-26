package com.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ModulusClock();
    }

        public static void ModulusClock(){
            Scanner Keyboard;
            Keyboard = new Scanner(System.in);
            System.out.println("Enter a value for hours");
            int hours = Keyboard.nextInt();
            System.out.println("Enter a value for minutes");
            int minutes = Keyboard.nextInt();
            hours = 60 <= minutes ? ++hours : hours;


            System.out.println(hours%12);
            System.out.println(minutes%60);






    }
}
